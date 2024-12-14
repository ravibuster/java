import java.util.Scanner;
public class bubbleSort {
  static void printArray(int[]arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
  static void swap(int[] arr, int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  static void sort(int[] arr, int n){
    int k = n-1 ;
    while ( k != 0) {
      boolean flag = false;
      for (int i = 0; i < n-1; i++) {
        if (arr[i]>arr[i+1]) {
          swap(arr, i, i+1);
          flag = true;
        }
      }
      if (!flag) {
         break;
      }
      k--;
      n--;
    }
    printArray(arr);
  }
 public static void main(String[] args) {
  System.out.print("Enter the Size of Array : ");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  System.out.println("enter the elements");
  int[] arr = new int[n];
  for (int i = 0; i < arr.length; i++) {
    arr[i] = sc.nextInt();
  }
  sort(arr, n);
  sc.close();
 } 
}
