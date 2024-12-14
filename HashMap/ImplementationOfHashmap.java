import java.util.LinkedList;

public class ImplementationOfHashmap {
  static class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 4;
    private static final float LOAD_FACTOR = 0.75f;
    private int n = 0;

    private class Node {
      K key;
      V value;

      Node(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private LinkedList<Node>[] buckets;

    private void initbuckets(int N) {
      buckets = new LinkedList[N];
      for (int i = 0; i < buckets.length; i++) {
        buckets[i] = new LinkedList<>();
      }
    }

    private int hasFunc(K key) {
      int hc = key.hashCode();
      return ((Math.abs(hc)) % buckets.length);
    }

    private int searchInBucket(LinkedList<Node> ll, K key) {
      for (int i = 0; i < ll.size(); i++) {
        if (ll.get(i).key.equals(key)) {
          return i;
        }
      }
      return -1;
    }

    private void reHash(){
      LinkedList<Node>[] oldBuckets = buckets;
      initbuckets(buckets.length*2);
      for (var bucket : oldBuckets) {
        for (var node : bucket) {
          put(node.key,node.value);
        }
      }
    }

    public MyHashMap() {
      initbuckets(DEFAULT_CAPACITY);
    }

    public int size() {
      return n;
    }

    public void put(K key, V value) { // insert/update
      if(n >= buckets.length*LOAD_FACTOR){
        reHash();
      }
      
      int bi = hasFunc(key);
      LinkedList<Node> currBucket = buckets[bi];
      int ei = searchInBucket(currBucket, key);
      if (ei == -1) { // if key doesn't exist , we have to insert a new node
        Node node = new Node(key, value);
        currBucket.add(node);
        n++;
      } else { // update case
        Node currNode = currBucket.get(ei);
        currNode.value = value;
      }
    }

    public V get(K key) {
      int bi = hasFunc(key);
      LinkedList<Node> currBucket = buckets[bi];
      int ei = searchInBucket(currBucket, key);
      if (ei != -1) {
        Node currNode = currBucket.get(ei);
        return currNode.value;
      }
      return null;
    }

    public V remove(K key) {
      int bi = hasFunc(key);
      LinkedList<Node> currBucket = buckets[bi];
      int ei = searchInBucket(currBucket, key);
      if (ei != -1) {
        Node currNode = currBucket.remove(ei);
        n--;
        return currNode.value;
      }
      return null;
    }
  }



  public static void main(String[] args) {
    MyHashMap<String, Integer> mp = new MyHashMap<>();
    mp.put("a", 1);
    mp.put("b", 2);
    mp.put("c", 3);
    mp.put("d", 4);
    System.out.println(mp.size());
    System.out.println(mp.get("b"));
    System.out.println(mp.remove("d"));
    System.out.println(mp.size());
    mp.put("a",10);
    System.out.println(mp.get("a"));

  }
}
