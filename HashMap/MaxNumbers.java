import java.util.HashSet;

/// you have given a pair of integers you have to find the maximum no. which can be put on table
public class MaxNumbers {
  public static void main(String[] args) {
    int[] nums = {2,1,1,3,2,3};
    int maxNum = 0;
    HashSet<Integer> st = new HashSet<>();
    for (int num : nums) {
      if (!st.contains(num)) {
        st.add(num);
        maxNum = Math.max(maxNum,st.size());
      }else{
        st.remove(num);
      }
    }
    System.out.println(maxNum);
  }
}
