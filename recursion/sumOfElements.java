import java.util.Scanner;

public class sumOfElements {
  
  static int elementSum(int[] arr , int ind){
    if (ind == arr.length) {
      return 0;
    }
    return arr[ind]+elementSum(arr, ind+1);
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
    System.out.println(elementSum(arr, 0));
    sc.close();
  }
}
