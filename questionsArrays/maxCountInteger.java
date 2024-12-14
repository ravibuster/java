import java.util.Scanner;
public class maxCountInteger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int result = maxFrequencyCount(arr, k);
    System.out.println(result);
    sc.close();
  }

  public static int maxFrequencyCount(int[] arr, int k) {
    int count = 0 ;
    int maxCount = 0;
    int result = -1;
    for(int num : arr){
      count = countFrequency(num , k);
      if (count > maxCount) {
        maxCount = count; 
        result = num ;
      }
    }
    return result;
    
  }

  private static int countFrequency(int num, int k) {
    int count = 0 ;
   while (num>0) {
    int unitDigit = num%10;
    if (unitDigit == k) {
      count++;
    }
    num/=10;
   }
   return count;
  }
}
