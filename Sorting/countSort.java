import java.util.Scanner;
public class countSort {
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

  // static void basicSort(int[] arr){
  //   int max = findmax(arr);
  //   int[] count = new int[max + 1];
  //   for (int i = 0; i < arr.length; i++) {
  //     count[arr[i]]++;
  //   }
  //   int k = 0;
  //   for (int i = 0; i < count.length; i++) {
  //     for (int j = 0; j < count[i]; j++) {
  //       arr[k++]=i;
  //     }
  //   }
  //   printArray(arr);
  // }

  static void sort(int[] arr){
    int max = findmax(arr);
    int[] count = new int[max + 1];

    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    int[] output = new int[arr.length];
    for (int i = 1; i < count.length; i++) {
      count[i]+=count[i-1];
    }

    for (int i = arr.length -1; i >=0; i--) {
      int ind = count[arr[i]] -1;
      output[ind] = arr[i];
      count[arr[i]]--;
    }
    printArray(output);
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
  // basicSort(arr);
  sort(arr);
  sc.close();
 } 
}
