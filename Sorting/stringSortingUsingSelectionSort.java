import java.util.Scanner;
public class stringSortingUsingSelectionSort {
  static void printArray(String[]arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
  static void swap(String[] arr, int i , int j){
    String temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  static void sort(String[] arr, int n){
    for (int i = 0; i < arr.length-1; i++) {
      int minIndex = i;
      for (int j = i+1; j < arr.length; j++) {
        if (arr[minIndex].compareTo(arr[j])>0) {
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
  String[] arr = new String[n];
  for (int i = 0; i < arr.length; i++) {
    arr[i] = sc.next();
  }
  sort(arr, n);
  sc.close();
 } 
}
