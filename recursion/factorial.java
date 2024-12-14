import java.util.Scanner;

public class factorial {
  static int calculateFactorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * calculateFactorial(n - 1);

  }

  public static void main(String[] args) {
    System.out.print("Enter the number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fact = calculateFactorial(n);
    System.out.println(fact);
    sc.close();
  }
}
