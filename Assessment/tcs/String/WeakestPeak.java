import java.util.*;

public class eakestPeak {
    public static List<Integer> solve(int n, int q, int[] traffic_volume, int[] queries) {
        List<Integer> result = new ArrayList<>();
        
        for (int w : queries) {
            Deque<Integer> deque = new LinkedList<>();
            int weakestPeak = Integer.MAX_VALUE;

            // Process the first window of size w
            for (int i = 0; i < w; i++) {
                while (!deque.isEmpty() && traffic_volume[deque.peekLast()] <= traffic_volume[i]) {
                    deque.pollLast();
                }
                deque.offerLast(i);
            }

            // Process the rest of the windows
            for (int i = w; i < n; i++) {
                // The maximum of the current window is at the front of the deque
                weakestPeak = Math.min(weakestPeak, traffic_volume[deque.peekFirst()]);

                // Remove elements that are out of the current window
                while (!deque.isEmpty() && deque.peekFirst() <= i - w) {
                    deque.pollFirst();
                }

                // Add the current element
                while (!deque.isEmpty() && traffic_volume[deque.peekLast()] <= traffic_volume[i]) {
                    deque.pollLast();
                }
                deque.offerLast(i);
            }

            // Check the last window
            weakestPeak = Math.min(weakestPeak, traffic_volume[deque.peekFirst()]);

            // Add the weakest peak for this window size
            result.add(weakestPeak);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] traffic_volume = new int[n];
        for (int i = 0; i < n; i++) {
            traffic_volume[i] = sc.nextInt();
        }
        int[] queries = new int[q];
        for (int i = 0; i < q; i++) {
            queries[i] = sc.nextInt();
        }

        // Solve and output the result
        List<Integer> result = solve(n, q, traffic_volume, queries);
        for (int res : result) {
            System.out.println(res);
        }

        sc.close();
    }
}