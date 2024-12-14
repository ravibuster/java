import java.util.*;

// returns maxLength subArray whose sum is zero
public class LargestSubArray {
  public static void main(String[] args) {
    int[] arr = {15,-2,2,-8,1,7,10};
    int maxlength = 0;
    Map<Integer,Integer> mp = new HashMap<>();
    int prefix = 0;
    for (int i = 0; i < arr.length; i++) {
      prefix += arr[i];
      if(!mp.containsKey(prefix)){
        mp.put(prefix,i);
      }else{
        maxlength = i - mp.get(prefix);
      }
    }
    System.out.println(maxlength);
  }

}
