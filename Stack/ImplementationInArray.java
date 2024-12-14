public class ImplementationInArray {
  public static class stack  {
    private int[] arr = new int[4];
    private int ind = 0;
    void push(int x){
      if (!isFull()) {
      arr[ind] = x;
      ind++;
      }else{
        System.out.println("Stack is Full");
      }
    }
    void peek(){
      System.out.println(arr[ind-1]);
    }
    int pop(){
      if (!isEmpty()) {
      int x= arr[ind-1];
      arr[ind-1] = 0;
      ind--;
      return x;
      }else{
        System.out.println("Stack is empty");
      }
      return -1;
    }
    void display(){
      for (int i = 0; i <ind; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
    boolean isFull(){
      if (ind == arr.length) {
        return true;
      }
      return false;
    }
    boolean isEmpty(){
      if (ind == 0) {
        return true;
      }
      return false;
    }
    int capacity(){
      return arr.length;
    }
  }
  

  public static void main(String[] args) {
    stack st = new stack();
    st.pop();
    st.push(1);
    st.display();
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.display();
    st.pop();
    st.display();
    st.peek();
    st.display();

  }
  
}