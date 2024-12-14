import java.util.Scanner;
public class sortedSquareArray {
  static void printArray(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  static void swap(int[] arr, int i, int j){
    int temp;
    temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

  }
  static void reverseArray(int[] arr,int i, int j){
   while (i<j) {
    swap(arr, i, j);
    i++;
    j--;
   }
  }
  static int[] squaredArray(int[] arr){ 
    int i =0;
    int j =arr.length-1;
    int k =0;
    int [] ans = new int[arr.length];
    while(i<=j){
    if (Math.abs(arr[i]) >Math.abs(arr[j])) {
      ans[k++] = arr[i]*arr[i];
      i++;
    }else{
      ans[k++]=arr[j]*arr[j];
      j--;
      if(i==j){
        ans[k]=arr[i]*arr[j];
      }
    }
    }
    return ans;
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
    int[] ans = squaredArray(arr);
    reverseArray(ans, 0, n-1);
    printArray(ans);
    sc.close();
  }
}
