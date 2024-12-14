import java.util.*;

public class Anagram {
  public static void main(String[] args) {
    String s1 = "silent";
    String s2 = "listen";  
    if (s1.length() != s2.length()) {
      System.out.println("Invalid Anagram!");
    }else{
      Map<Character,Integer> mp1 = new HashMap<>();
      Map<Character,Integer> mp2 = new HashMap<>();
      for (int i = 0; i < s1.length(); i++) {
        char ch = s1.charAt(i);
        if (!mp1.containsKey(ch)) {
          mp1.putIfAbsent(ch,1);
        }else{
          mp1.put(ch, mp1.get(ch)+1);
        }
      }
  
      for (int i = 0; i < s2.length(); i++) {
        char ch = s2.charAt(i);
        if (!mp2.containsKey(ch)) {
          mp2.put(ch,1);
        }else{
          mp2.put(ch, mp2.get(ch)+1);
        }
      }
  
      if (mp1.equals(mp2)) {
        System.out.println("valid Anagram!");
      }else{
        System.out.println("Invalid Anagram!");
      }
    }
    
  }
}
