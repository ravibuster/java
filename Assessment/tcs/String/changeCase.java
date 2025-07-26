// package tcs.String;
import java.util.*;

public class changeCase {
    static class Edge {
        int to, cost;

        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    static List<List<Edge>> tree;
    static Map<Pair, Integer> edgeCosts;
    static int[][] parent;
    static int[] depth;
    static int[] subtreeSize;
    static int[] pathCost;
    static int LOG;

    static class Pair {
        int u, v;

        Pair(int u, int v) {
            this.u = Math.min(u, v);
            this.v = Math.max(u, v);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return u == pair.u && v == pair.v;
        }

        @Override
        public int hashCode() {
            return Objects.hash(u, v);
        }
    }

    public static int solve(int N, int R, List<List<Integer>> edges, int Q, List<List<Integer>> queries) {
        tree = new ArrayList<>();
        edgeCosts = new HashMap<>();
        LOG = (int) Math.ceil(Math.log(N) / Math.log(2));
        parent = new int[N + 1][LOG];
        depth = new int[N + 1];
        subtreeSize = new int[N + 1];
        pathCost = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }

        // Build the tree and store edge costs
        for (List<Integer> edge : edges) {
            int u = edge.get(0), v = edge.get(1), w = edge.get(2);
            tree.get(u).add(new Edge(v, w));
            tree.get(v).add(new Edge(u, w));
            edgeCosts.put(new Pair(u, v), w); // Add edge to edgeCosts map
        }

        // Preprocess the tree
        dfs(R, -1, 0, 0);
        preprocessLCA(N);

        int totalCost = 0;

        // Process queries
        for (List<Integer> query : queries) {
            int type = query.get(0);
            if (type == 1) {
                // Bandwidth Cost Query
                int A = query.get(1);
                int B = query.get(2);
                totalCost += queryCost(A, B);
            } else if (type == 2) {
                // Cost Update Query
                int U = query.get(1);
                int V = query.get(2);
                int W = query.get(3);
                updateCost(U, V, W);
            }
        }

        return totalCost;
    }

    // DFS to calculate depth, parent, and path costs
    private static void dfs(int node, int par, int dep, int cost) {
        parent[node][0] = par;
        depth[node] = dep;
        pathCost[node] = cost;
        subtreeSize[node] = 1;

        for (Edge edge : tree.get(node)) {
            if (edge.to != par) {
                dfs(edge.to, node, dep + 1, cost + edge.cost);
                subtreeSize[node] += subtreeSize[edge.to];
            }
        }
    }

    // Preprocess LCA using Binary Lifting
    private static void preprocessLCA(int N) {
        for (int j = 1; j < LOG; j++) {
            for (int i = 1; i <= N; i++) {
                if (parent[i][j - 1] != -1) {
                    parent[i][j] = parent[parent[i][j - 1]][j - 1];
                }
            }
        }
    }

    // Find LCA of two nodes
    private static int findLCA(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        // Bring u and v to the same depth
        for (int i = LOG - 1; i >= 0; i--) {
            if (parent[u][i] != -1 && depth[parent[u][i]] >= depth[v]) {
                u = parent[u][i];
            }
        }

        if (u == v) return u;

        // Move both u and v up until their parents are the same
        for (int i = LOG - 1; i >= 0; i--) {
            if (parent[u][i] != parent[v][i]) {
                u = parent[u][i];
                v = parent[v][i];
            }
        }

        return parent[u][0];
    }

    // Query the cost between two nodes
    private static int queryCost(int u, int v) {
        int lca = findLCA(u, v);
        return pathCost[u] + pathCost[v] - 2 * pathCost[lca];
    }

    // Update the cost of an edge
    private static void updateCost(int u, int v, int w) {
        Pair edge = new Pair(u, v);
        Integer oldCost = edgeCosts.get(edge);
        if (oldCost == null) {
            throw new IllegalArgumentException("Edge does not exist between " + u + " and " + v);
        }
        edgeCosts.put(edge, w);

        // Update path costs
        int diff = w - oldCost;
        if (depth[u] > depth[v]) {
            pathCost[u] += diff;
        } else {
            pathCost[v] += diff;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int N = sc.nextInt();
        int R = sc.nextInt();
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            List<Integer> edge = new ArrayList<>();
            edge.add(sc.nextInt());
            edge.add(sc.nextInt());
            edge.add(sc.nextInt());
            edges.add(edge);
        }
        int Q = sc.nextInt();
        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            List<Integer> query = new ArrayList<>();
            int type = sc.nextInt();
            query.add(type);
            if (type == 1) {
                query.add(sc.nextInt());
                query.add(sc.nextInt());
            } else if (type == 2) {
                query.add(sc.nextInt());
                query.add(sc.nextInt());
                query.add(sc.nextInt());
            }
            queries.add(query);
        }

        // Solve and output the result
        int result = solve(N, R, edges, Q, queries);
        System.out.println(result);

        sc.close();
    }
}