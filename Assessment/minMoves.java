import java.util.HashMap;

public class minMoves {
  public static void main(String[] args) {
    String message = "baabacaa";
    int count = 0;
    HashMap<Character,Integer> mp = new HashMap<>();
    for (int i = 0; i < message.length()-1; i++) {
      mp.put(message.charAt(i),mp.getOrDefault(message.charAt(i), 0)+1);
    }
    for(char ch : mp.keySet()){
      if (mp.get(ch) > 1) {
        count += (mp.get(ch)/2);
      }
    }
    System.out.println(count);
  }
}
