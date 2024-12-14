import java.util.Scanner;
public class quickSort {
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
  static int partition(int[] arr, int first, int last){
    int pivot = arr[first];
    int count = 0;
    for (int i = first +1; i <= last; i++) {
      if (arr[i]<=pivot) {
        count++;
      }
    }
    int pivotIndex = first + count;
    swap(arr, first, pivotIndex);
    int i=0,j=arr.length-1;
    while (i<pivotIndex && j>pivotIndex) {
      while (arr[i]<pivot) {
        i++;
      }
      while (arr[j]>pivot) {
        j--;
      }
      if (i < pivotIndex && j> pivotIndex) {
        swap(arr, i, j);
        i++;
        j--;
      }
    }
    return pivotIndex;
  }
  static void sort(int[] arr, int first, int last){
    if (first>=last) {
      return;
    }
    int pI = partition(arr, first, last);;
    sort(arr, first, pI-1);
    sort(arr, pI+1, last);
  
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
  sort(arr, 0 , n-1);
  printArray(arr);
  sc.close();
 } 
}


