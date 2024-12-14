import java.util.Scanner;


public class peakElement {
 
  static int peakIndex(int[] arr){
    int st = 0 , end = arr.length-1;
    while(st<end){
      int mid = st + (end-st)/2 ;
      if (arr[st]==arr[mid] && arr[mid]==arr[end]) {
        st++;
        end--;
      }
      if (arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) {
        return mid;
      }else if (arr[mid]<arr[mid+1]) {
        st = mid +1;
      }else{
        end = mid -1;
      }
    }
    return -1;
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
    System.out.println(peakIndex(arr));
  
    sc.close();

  }
}

