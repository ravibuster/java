import java.util.Scanner;

public class occurenceOfElement {
  static void printArray(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static int countElement(int[] arr, int element){
    int count =0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]==element) {
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    System.out.print("Enter the size of array : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n]; 
    System.out.println("Enter the "+n+ " elements of array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter the Element : ");
    int element = sc.nextInt();
    int occurs =countElement(arr, element);
    System.out.println("Element "+element+ " occurs " +occurs+" times in array");
    sc.close();
  }
}