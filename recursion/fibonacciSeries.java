
import java.util.Scanner;
public class fibonacciSeries {
  static int fibonacciNumber(int n){
    if (n==1) {
      return 1;
    }
    if (n==0) {
      return 0;
    }
    int fiboNumber = fibonacciNumber(n-1) + fibonacciNumber(n-2); 
    return fiboNumber;
  
  }
    public static void main(String[] args) {
      System.out.print("Enter the number : ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int num = fibonacciNumber(n);
      System.out.println(num);

      sc.close();
      
    }
}
