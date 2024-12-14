import java.util.Scanner;
public class nthNodeFromEnd {
  static class node{
    int data;
    node next;
    node(int data){
      this.data=data;
    }
  }

  static void display(node head){
    node temp = head;
    while (temp!=null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  static void deleteNthNodeFromLast(node head,int n){
    node fast = head;
    node slow = head;
    for (int i = 1; i <= n ; i++) {
      fast = fast.next;
    }

    while (fast.next!=null) {
      fast =fast.next;
      slow = slow.next;
    }
    slow.next = slow.next.next;
  }
  // static node nthNodeFromLast(node head,int n){
  //   node temp = head;
  //   while (temp!= null) {
  //     temp = temp.next;
  //     size++;
  //   }

  //   int m = size - n + 1;
  //   temp = head;
  //   for (int i = 1; i < m; i++) {
  //     temp = temp.next;
  //   }

  //   return temp;
  // }

  /// better approach in a single traversal

  // static node nthNodeFromLast(node head,int n){
  //   int size = 0;
  //   node fast = head;
  //   node slow = head;
  //   for (int i = 1; i <= n; i++) {
  //     fast = fast.next;
  //   }

  //   while (fast!=null) {
  //     fast =fast.next;
  //     slow = slow.next;
  //   }
    
  //   return slow;
  // }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    node a  = new node(10);
    node b  = new node(20);
    node c  = new node(30);
    node d  = new node(40);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = null;
   // node n = nthNodeFromLast(a, 2);
   // System.out.println(n.data);
   deleteNthNodeFromLast(a, 3);
   display(a);
    sc.close();
  }
}

