import java.util.Scanner;

public class BinarySearch {
  // static int binarySearch(int[] arr, int target){
  // int st = 0 , end = arr.length-1;
  // while (st<=end) {
  // int mid = st + (end-st)/2;
  // if (arr[mid]==target) {
  // return mid;
  // }else if (arr[mid]< target) {
  // st = mid +1;
  // }else{
  // end = mid -1;
  // }
  // }
  // return -1;
  // }

  static int binarySearch(int[] arr, int target, int st, int end) {
    if (st > end) {
      return -1;
    }
    int mid = st + (end - st) / 2;
    if (arr[mid] == target) {
      return mid;
    } else if (arr[mid] < target) {
      st = mid + 1;
      return binarySearch(arr, target, st, end);
    } else {
      end = mid - 1;
      return binarySearch(arr, target, st, end);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter the elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the target element ");
    int target = sc.nextInt();
    System.out.println(binarySearch(arr, target, 0, n-1));
    sc.close();

  }
}
