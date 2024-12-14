import java.util.Scanner;
public class insertionSort {
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
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = i; j >=0; j--) {
        if (arr[j+1] < arr[j]) {
          swap(arr, j+1, j);
        }
      }
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
