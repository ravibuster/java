import java.util.Scanner;

public class targetSum {
  static int countTargetSum(int[] arr, int element){
    int count =0;
    for (int i = 0; i < arr.length; i++) {
     for (int j = i+1; j < arr.length; j++) {
      if (arr[i]+arr[j]==element) {
        count++;
      }
     }
    }
    return count;
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
    System.out.print("Enter the Element : ");
    int element = sc.nextInt();
    int occurs =countTargetSum(arr, element);
    System.out.println("pair sum of "+element+ " occurs " +occurs+" times in array");
    sc.close();
  }
}
