import java.util.Scanner;

public class checkPrefixAndSuffixSum {
  static boolean prefixSufixSum(int[] arr){
    int totalSum=0;
    for (int i = 0; i < arr.length; i++) {
      totalSum+=arr[i];
    }
    int prefixSum = 0;
    int suffixSum = 0;
    for (int i = 0; i < arr.length; i++) {
      prefixSum += arr[i];
      suffixSum = totalSum - prefixSum ;
      if (prefixSum==suffixSum) {
        return true;
      }
    }
    return false;
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
    System.out.println(prefixSufixSum(arr));
    sc.close();
  }
}

