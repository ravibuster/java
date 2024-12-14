import java.util.Scanner;
public class selectionSort {
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
      int minIndex = i;
      for (int j = i+1; j < arr.length; j++) {
        if (arr[minIndex] > arr[j]) {
          minIndex = j;
        }
      }
      if (minIndex!=i) {
        swap(arr, i, minIndex);
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
