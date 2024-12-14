import java.util.Scanner;
public class counter {
  public static void main(String[] args){
    int[] arr = {2,1,3};
    int[] counter = new int[arr.length];
  
    for (int i = 1; i < counter.length; i++) {
      int sum = 0;
      for (int j = 0; j < i; j++) {
        sum = arr[i] - arr[j];
        counter[i] += sum; 
      }
      
    }
    for (int i = 0; i < counter.length; i++) {
      System.out.print(counter[i] + " ");
    }
  }
}
