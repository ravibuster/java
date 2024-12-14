import java.util.Scanner;
public class radixSort {
  static void printArray(int[]arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
  static int findmax(int[] arr){
    int max = arr [0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i]>max) {
       max = arr[i]; 
      }
    }
    return max;
  }

  static void countsort(int[] arr,int n){
    int[] count = new int[10];

    for (int i = 0; i < arr.length; i++) {
      count[arr[i]/n%10]++;
    }

    int[] output = new int[arr.length];
    for (int i = 1; i < count.length; i++) {
      count[i]+=count[i-1];
    }

    for (int i = arr.length -1; i >=0; i--) {
      int ind = count[arr[i]/n%10] -1;
      output[ind] = arr[i];
      count[arr[i]/n%10]--;
    }
    for (int i = 0; i < output.length; i++) {
      arr[i]= output[i];
    }
  }

  static void radixsort(int[] arr){
    int max = findmax(arr);
    for (int i = 1; max/i>0; i*=10) {
      countsort(arr,i);
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
  radixsort(arr);
  sc.close();
 } 
}
