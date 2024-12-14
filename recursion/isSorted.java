import java.util.Scanner;
public class isSorted {
  static boolean isSort(int[] arr,int ind){
    if (ind +1 > arr.length -1) {
      return true;
    }
    if (arr[ind]> arr[ind+1]) {
      return false;
    }
    return isSort(arr, ind+1);
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
    if (isSort(arr, 0)) {
      System.out.println("Sorted");
    }else{
      System.out.println("Not Sorted");
    }
    sc.close();
  }
}
