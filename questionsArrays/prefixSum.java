import java.util.Scanner;

public class prefixSum {
  static void printArray(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
  static void preElementSum(int[] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum+=arr[i];
      arr[i]=sum;
    }
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
    preElementSum(arr);
    printArray(arr);
    sc.close();
  }
}
