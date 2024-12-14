import java.util.Scanner;

public class sumOfDigit {
  static int digitSum(int n){
    if (n==0) {
      return 0;
    }
    int digit = n%10;
    n/=10;
    return digit + digitSum(n);

  }
  public static void main(String[] args) {
    System.out.print("enter the number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = digitSum(n);
    System.out.println(ans);

    sc.close();
  }
}
