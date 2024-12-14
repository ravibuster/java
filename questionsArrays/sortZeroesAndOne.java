import java.util.Scanner;
public class sortZeroesAndOne {
  static void printArray(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  static void swap(int[] arr, int i, int j){
    int temp;
    temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

  }
  static void sortArray(int[] arr){
   int i =0;
   int j =arr.length-1;
   while(i<j){
    if (arr[i]==1&&arr[j]==0) {
      swap(arr,i,j);
      i++;
      j--;
    }
    if (arr[i]==0) {
      i++;
    }
    if (arr[j]==1) {
      j--;
    }
    
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
    sortArray(arr);
    printArray(arr);
    sc.close();
  }
}
