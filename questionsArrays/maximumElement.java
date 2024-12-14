import java.util.Scanner;
public class maximumElement {
  static int maxElement(int[] arr){
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i]>max) {
        max=arr[i];
      }
    }
    return max;
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
    int element =maxElement(arr);
    System.out.println(element);
    sc.close();
  }
}
