import java.util.Scanner;
public class mergeSort {
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
  static void merge(int[] arr, int first,int mid, int last){
    int n1 = mid-first+1;
    int n2 = last- mid;
    int[] left = new int[n1];
    int[] right = new int[n2];

    for (int i = 0; i < n1; i++) {
      left[i] = arr[first + i];
    }

    for (int i = 0; i < n2; i++) {
      right[i] = arr[mid+i+1];
    }

    int i=0,j=0, k =first;

    while (i<n1&&j<n2) {
      if (left[i]>right[j]) {
        arr[k++] = right[j++];
      }
      else{
        arr[k++] = left[i++];
      }
    }

    while(i<n1){
      arr[k++]=left[i++];
    }
    while(j<n2){
      arr[k++]=right[j++];
    }
  }
  static void sort(int[] arr, int first, int last){
    if (first>=last) {
      return;
    }
    int mid = (first + last)/2;
    sort(arr, first, mid);
    sort(arr, mid+1, last);
    merge(arr, first, mid, last);
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

