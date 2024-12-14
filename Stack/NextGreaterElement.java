import java.util.Stack;

public class NextGreaterElement {
  // static int[] nextGreaterElement(int[] arr){
  //   Stack<Integer> st = new Stack<>();
  //   int n = arr.length; 
  //   int[] res = new int[n];
  //   res[n-1] = -1;
  //   st.push(arr[n-1]);
  //   for(int i = n-2;i>=0;i--){
  //     res[i] =-1;
  //     if (st.peek()>arr[i]) {
  //       res[i] = st.push(st.peek());
  //       st.push(arr[i]);
  //     }else{
  //       while (st.size() > 0 && st.peek() < arr[i]) {
  //        st.pop();
  //       }
  //       if (!st.empty()) {
  //         res[i] = st.peek();
  //       }
  //       st.push(arr[i]);
  //     }
  //   }
  //   return res;
  // }

  // Another approach using Indexes

  static int[] nextGreaterElement(int[] arr){
    Stack<Integer> st = new Stack<>();
    int n = arr.length; 
    int[] res = new int[n];
    st.push(0);
    for (int i = 1; i < res.length; i++) {
      res[i] = -1;
      while(!st.isEmpty() && arr[st.peek()]<arr[i]){
        res[st.peek()] = arr[i];
        st.pop();
        
      }st.push(i);
    }
    return res;
  }
   public static void main(String[] args) {
    int[] arr = {1,5,3,2,1,6,3,4};
    int[] res = nextGreaterElement(arr);
    for (int i = 0; i < res.length; i++) {
      System.out.print(res[i]+ " ");
    }
  }
}