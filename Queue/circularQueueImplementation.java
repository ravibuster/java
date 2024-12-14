public class circularQueueImplementation {
  public static class circularQueue{
    private int f = -1;
    private int r = -1;
    private int size = 0;
    private int[] arr = new int[8];

    void add(int val){
      if (size == arr.length) {
        System.out.println("Queue is Full!");
        return;
      }else if(size == 0){
        f = r = 0;
        arr[f] = val;
      }else if(r == arr.length-1){
        r = 0;
        arr[r] = val;
      }else{
        arr[++r] = val;
      }
      size++;
    }

    int remove(){
      if (size == 0) {
        System.out.println("Queue is Empty!");
        return -1;
      }else if(f == arr.length-1){
        int x = arr[f];
        f = 0;
        size--;
        return x;
      }
      int x = arr[f++];
      size--;
      return x;
    }

    int peek(){
      if (size == 0) {
        System.out.println("Queue is Empty!");
        return -1;
      }
      return arr[f];
    }

    void display(){
      if (size == 0) {
        System.out.println("Queue is Empty!");
      }
      else if (f<=r) {
        for (int i = f; i <= r; i++) {
          System.out.print(arr[i]+" ");
        }
        System.out.println();
      }else{
        for (int i = f; i <= arr.length-1; i++) {
          System.out.print(arr[i] + " ");
        }
        for (int i = 0; i <= r; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
      }
    }

  }
  public static void main(String[] args) {
    circularQueue cq = new circularQueue();
    cq.peek();
    cq.remove();
    cq.add(1);
    cq.add(2);
    cq.add(3);
    cq.add(4);
    cq.add(5);
    cq.add(6);
    cq.add(7);
    cq.add(8);
    cq.display();
    cq.add(9);
    cq.display();
    cq.peek();
    cq.remove();
    cq.display();
    cq.add(10);
    cq.display();
    cq.remove();
    cq.remove();
    cq.remove();
    cq.remove();
    cq.remove();
    cq.remove();
    cq.remove();
    cq.remove();
    cq.display();
  }
}
