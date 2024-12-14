public class ImplementationInLL {
  static class node{
    private int val;
    private node next;
    node(int val){
      this.val = val;
    }
  }
  public static class stack  {
   node head = null;
   int size = 0;
   void push(int x){
    node temp = new node(x);
    if (head == null) {
      head = temp;
    }else{
      temp.next = head;
      head = temp;
    }
    size++;
   }
   void peek(){
    System.out.println(head.val);
   }
   int pop(){
   if (!isEmpty()) {
    int x = head.val;
    head = head.next;
    size--;
    return x;
   }else{
    System.out.println("Stack is empty");
   }
   return -1;
   }
   boolean isEmpty(){
    if (head == null) {
      return true;
    }else{
      return false;
    }
   }
   void displayRec(node h){
    node temp = h;
    if (temp == null) {
      return ;
    }
    displayRec(temp.next);
    System.out.print(temp.val + " ");
   }
   void display(){
    displayRec(head);
    System.out.println();
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
    st.pop();
    st.display();
    st.peek();
    st.display();

  }
  
}