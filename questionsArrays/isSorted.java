import java.util.Scanner;
public class isSorted {
  static boolean isSort(int[] arr){
    for (int i = 1; i < arr.length; i++) {
      if(arr[i]<arr[i-1]){
        return false;
      }
    }
    return true;
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
    if (isSort(arr)) {
      System.out.println("Array is sorted");
    }else{
      System.out.println("Array is not sorted");
    }
    sc.close();
  }
}
