import java.util.Scanner;

public class firstRepeatingNumber {
  static int repeatingElement(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if (arr[i]==arr[j]) {
          return arr[i];
        }
      }
    }
    return -1;
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
    int element =repeatingElement(arr);
    System.out.println("First repeating element is : "+ element);
    sc.close();
  }
}