
//find min index in sorted Array
import java.util.Scanner;

public class RotatedArray {
  // static int minIndex(int[] arr){
  // int st = 0 , end = arr.length-1;
  // int ans =-1;
  // while (st<=end) {
  // int mid = st + (end-st)/2;
  // if(arr[mid]<=arr[end]){
  // ans = mid;
  // end = mid -1;
  // }else{
  // st = mid+1;
  // }
  // }
  // return ans;
  // }

  // static int targetIndex(int[] arr, int target) {
  // int st = 0, end = arr.length - 1;
  // int ans = -1;
  // while (st <= end) {
  // int mid = st + (end - st) / 2;
  // if (arr[mid] == target) {
  // return mid;
  // }
  // if (arr[mid] < arr[end]) {
  // if (arr[mid] < target && target <= arr[end]) {
  // st = mid + 1;
  // } else {
  // end = mid - 1;
  // }
  // } else {
  // if (arr[st] <= target && target < arr[mid]) {
  // end = mid - 1;
  // } else {
  // st = mid + 1;
  // }
  // }
  // }
  // return ans;
  // }

  static int targetIndexInDuplicateArray(int[] arr, int target) {
    int st = 0, end = arr.length - 1;
    int ans = -1;
    while (st <= end) {
      int mid = st + (end - st) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[st] == arr[mid] && arr[mid] == arr[end]) {
        st++;
        end--;
      } else if (arr[mid] <= arr[end]) {
        if (arr[mid] < target && target <= arr[end]) {
          st = mid + 1;
        } else {
          end = mid - 1;
        }
      } else {
        if (arr[st] <= target && target < arr[mid]) {
          end = mid - 1;
        } else {
          st = mid + 1;
        }
      }
    }
    return ans;
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
    System.out.print("enter the targeted Elements : ");
    int target = sc.nextInt();
    // System.out.println(minIndex(arr));
    // System.out.println(targetIndex(arr, target));
    System.out.println(targetIndexInDuplicateArray(arr, target));
    sc.close();

  }
}
