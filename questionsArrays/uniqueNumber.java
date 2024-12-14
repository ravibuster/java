// Find a unique element in a given array where all the elements are being repeated twice 
// with one value being unique 

import java.util.Scanner;
public class uniqueNumber {
  static int uniqueElement(int[] arr){
    int element = arr[0];
    for (int i = 1; i < arr.length; i++) {
       element ^= arr[i];
    }
    return element;
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
    int element = uniqueElement(arr);
    System.out.println("unique element is : "+element);
    sc.close();
  }
}
