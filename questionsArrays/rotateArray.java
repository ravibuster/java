import java.util.Scanner;

public class rotateArray{
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
    static void arrayReversal(int[] arr, int i, int j){
      while(i<j){
        swap(arr, i, j);
        i++;
        j--;
      }
    }

    static void arrayRotate(int[] arr, int k){
       int n = arr.length;
       k%=n;
       arrayReversal(arr, 0, n-k-1);
       arrayReversal(arr, n-k, n-1);
       arrayReversal(arr, 0, n-1);

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
    System.out.print("Enter the array rotaion number : ");
    int k = sc.nextInt();

    arrayRotate(arr,k);
    printArray(arr);
    sc.close();
  }
}
