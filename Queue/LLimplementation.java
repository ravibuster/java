public class LLimplementation {
  public static class node{
    private int val ;
    private node next;

    node(int val){
      this.val = val;
    }
  }

  public static class queueLL{
    node head;
    node tail;
    int size = 0;

    void add(int val){
      node temp = new node(val);
      if (head == null) {
        head = tail = temp;
      }else{
        tail.next = temp;
        tail = temp;
      }
      size++;
    }

    int remove(){
      if (head == null) {
        System.out.println("Queue is Empty!");
        return -1;
      }
      int x = head.val;
      head = head.next;
      size--;
      return x;
    }

    int peek(){
      if (head == null) {
        System.out.println("Queue is Empty!");
        return -1;
      }
      return head.val;
    }

    void display(){
      node temp = head;
      while(temp!= null){
        System.out.print(temp.val + " ");
        temp = temp.next;
      }
      System.out.println();
    }
    boolean isEmpty(){
      if (head == null) {
        return true;
      }
      return false;
    }
  }
  public static void main(String[] args) {
     queueLL q = new queueLL();
   System.out.println(q.isEmpty()); 
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.display();
    System.out.println(q.remove());
    q.display();
    System.out.println(q.peek());
  }  
}