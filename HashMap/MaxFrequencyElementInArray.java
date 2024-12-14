import java.util.*;
public class MaxFrequencyElementInArray {
  public static void main(String args[]){
    int[] arr = {1,2,3,1,4,1,2,3,};
    int max = 0;
    int maxElement = Integer.MIN_VALUE;
    Map<Integer,Integer> mp = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (!mp.containsKey(arr[i])) {
        mp.put(arr[i], 1);
      }else{
        mp.put(arr[i], mp.get(arr[i]) + 1);
      }
      for(var e : mp.keySet()){
        if (mp.get(e) > max) {
          max = mp.get(e);
          maxElement = e;
          break;
        }
      }
    }
    System.out.println(maxElement);
  }
}
