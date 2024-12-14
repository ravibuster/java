import java.util.ArrayList;
import java.util.Scanner;

public class linearSearch {
  
  // static boolean elementSearch(int[] arr , int ind, int element){
  //   if (ind > arr.length-1) {
  //     return false;
  //   }
  //   if (arr[ind] == element) {
  //     return true;
  //   }
  //   return elementSearch(arr, ind+1, element);
    
  // }

  // first target elemnt index
  // static int elementSearch(int[] arr , int ind, int element){
  //   if (ind > arr.length-1) {
  //     return -1;
  //   }
  //   if (arr[ind] == element) {
  //     return ind;
  //   }
  //   return elementSearch(arr, ind+1, element);
    
  // }

  // last target element index  
  // static int elementSearch(int[] arr , int ind, int element){
  //   if (ind < 0) {
  //     return -1;
  //   }
   
  //   if (arr[ind] == element) {
  //     return ind;
  //   }
    
  //   return elementSearch(arr, ind-1, element);
  // }

  // All the indices where the Target Element is present
  // static ArrayList<Integer> elementSearch(int[] arr , int ind, int element,ArrayList<Integer> list){
  //    if (ind > arr.length-1) {
  //     return list;
  //   }
   
  //   if (arr[ind] == element) {
  //     list.add(ind);
  //   }
    
  //   return elementSearch(arr, ind+1, element,list);
  // }

  static ArrayList<Integer> elementSearch(int[] arr , int ind, int element){
    ArrayList<Integer> list = new ArrayList<>();
    if (ind > arr.length-1) {
     return list;
   }
  
   if (arr[ind] == element) {
     list.add(ind);
   }
   
  ArrayList<Integer> smallList =   elementSearch(arr, ind+1, element);
  list.addAll(smallList);
   return list;
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
    System.out.println("enter the target element");
    int element= sc.nextInt(); 
    // ArrayList<Integer> list = new ArrayList<>();
   // System.out.println(elementSearch(arr, 0, element));
    // System.out.println(elementSearch(arr, arr.length-1, element));
    // System.out.println(elementSearch(arr, 0, element,list));
    System.out.println(elementSearch(arr, 0, element));
    sc.close();
  }
}
