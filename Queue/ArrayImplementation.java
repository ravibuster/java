public class ArrayImplementation {
  public static class queueA {
    int[] arr = new int[5];
    private int f = -1;
    private int r = -1;
    int size = 0;
    void add(int val){
      if(f == -1){
        f = r = 0;
        arr[f] = val;
      }else{
        if(size == arr.length){
          System.out.println("Queue is Full!");
          return;
        }
        arr[++r] = val;
      }
      size++;
    }
    int remove(){
      if (f == -1) {
        System.out.println("Queue is Empty!");
        return -1;
      }
      f++;
      size--;
      return arr[f-1];
    }
    int peek(){
      if (f==-1) {
        System.out.println("Queue is Empty!");
        return -1;
      }
      return arr[f];
    }
    void display(){
      if (f==-1) {
        System.out.println("Queue is Empty!");
        return ;
      }
      for (int i = f; i <= r; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
    boolean isEmpty(){
      if (f==-1) {
        return true ;
      }
      return false;
    }
  }
  public static void main(String[] args) {
  
    queueA q = new queueA();
   System.out.println(q.isEmpty()); 
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.display();
    q.add(6);
    System.out.println( q.remove());
    q.display();

}
  
}