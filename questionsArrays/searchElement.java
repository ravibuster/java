import java.util.Scanner;
public class searchElement {
  static int foundElement(int[] arr, int element){
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]==element) {
        return i;
      }
    }
    return -1;
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
    int index =foundElement(arr,element);
    System.out.println(index);
    sc.close();
  }
}
