import java.util.Stack;

public class removeConsecutiveSubsequences {
  static int[] removeSubsequences(int[] arr){
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (st.isEmpty()) {
        st.push(arr[i]);
      }else if (st.peek() == arr[i]) {
        if (i == arr.length-1 ||arr[i] != arr[i+1]) {
          st.pop();
        }
      }else{
        st.push(arr[i]);
      }
    }
    int[] res = new int[st.size()];
    for(int i = st.size() - 1; i >= 0 ; i--){
      res[i]= st.pop();
    }
    return res;
  }
   public static void main(String[] args) {
    int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
    int[] res = removeSubsequences(arr);
    for (int i = 0; i < res.length; i++) {
      System.out.print(res[i]+ " ");
    }
  }
}