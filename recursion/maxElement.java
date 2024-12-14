import java.util.Scanner;

public class maxElement {
  // static int maximum(int[] arr, int ind){
  //   int max = arr[0];
  //   if (ind==arr.length-1) {
  //     if (arr[ind]>max) {
  //       max = arr[ind];
  //     }
  //     return max;
  //   }
  //   if (arr[ind]>max) {
  //     max=arr[ind];
  //   }
  //   return maximum(arr, ind+1);
  // }

  static int maximum(int[] arr , int ind){
    if (ind == arr.length-1) {
      return arr[ind];
    }
    int small = maximum(arr, ind+1);
    int max = Math.max(small, arr[ind]);

    return max;
  }
  public static void main(String[] args) {
    System.out.println("enter the no.of elements in array");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("enter the Elements : ");
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=sc.nextInt();
    }
    System.out.println(maximum(arr, 0));
    sc.close();
  }
}
