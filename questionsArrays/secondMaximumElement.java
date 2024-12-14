import java.util.Scanner;
public class secondMaximumElement {
  static int secondMaxElement(int[] arr){
    int max = Integer.MIN_VALUE;
    int secondMax=max;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i]>max) {
        secondMax=max;
        max=arr[i];
      }
    }
    return secondMax;
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
    int element =secondMaxElement(arr);
    System.out.println("Second largest element is : "+element);
    sc.close();
  }
}