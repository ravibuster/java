import java.util.Scanner;
public class LL {
  public static class node{
    int data;
    node next;
    node(int data){
      this.data=data;
    }
  }

  public static class linkedList{
    node head = null;
    node tail = null;
    int size =0;

    // Recursive Approach
    // void display(){
    //  if (head==null) {
    //   return;
    //  }
    //  System.out.print(head.data);
    //  display(head.next);
    // }

    void display(){
      node temp = head;
      while (temp!= null) {
        System.out.print(temp.data +  " ");
        temp = temp.next;
      }
      System.out.println();
    }
    void insertAtEnd(int data){
      node temp = new node(data);
      if (head==null) {
        head = temp; 
      }
      else{
        tail.next = temp;
      }
      tail = temp;
      size++;
    }   

    void insertAtStart(int data){
      node temp = new node(data);
      if (head == null) {
        head = temp;
        tail = temp;
      }
      else{
        temp.next = head;
        head = temp;
      }
      size++;
    }

    void insertAtindex(int index, int data){
      node t = new node(data);
      node temp = head;
      if (index==0) {
        insertAtStart(data);
        return;
      }

      if (index == size) {
        insertAtEnd(data);
        return;
      }

      if (index < 0 || index > size) {
        System.out.println("Wrong Index");
        return;
      }
      for (int i = 1; i < index; i++) {
        temp = temp.next;
      }
      t.next = temp.next;
      temp.next = t;
      size++;
    }

    void deleteAtIndex(int index){
      node temp = head ;
      for (int i = 1; i < index; i++) {
        temp = temp.next;
      }
      temp.next = temp.next.next;

      if (index==size-1) {
        tail = temp;
      }
      size--;
    }

  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    linkedList ll = new linkedList();
    ll.insertAtEnd(10);
    ll.insertAtEnd(20);
    ll.insertAtStart(5);
    ll.display();
    ll.insertAtindex(3,6);
    ll.display();
    System.out.println(ll.size);
    ll.deleteAtIndex(3);
    ll.display();
    System.out.println(ll.tail.data);
    System.out.println(ll.size);
    sc.close();
  }
}
