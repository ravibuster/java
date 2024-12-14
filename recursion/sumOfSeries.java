// series : 1-2+3-4+....
import java.util.Scanner;

public class sumOfSeries {
  
  static int seriesSum(int n){
   if (n==1) {
    return 1;
   }
   int ans =0;
   if (n%2==0) {
    ans = -n + seriesSum(n-1);
    return ans;
   }
   ans= n + seriesSum(n-1);
   return ans;
  }
  public static void main(String[] args) {
    System.out.print("enter the number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = seriesSum(n);
    System.out.println(ans);
    sc.close();
  }
}