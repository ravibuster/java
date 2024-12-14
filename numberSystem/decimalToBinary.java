import java.util.Scanner;

public class decimalToBinary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Decimal Number : ");
    int Decimal = sc.nextInt();
    int n=Decimal;
    int pw =1;
    int ans= 0;

    while (n>0) {
      int unitDigit= n%2;
      ans += unitDigit*pw;
      pw*=10;
      n/=2;
    }
    System.out.println("Binary Number is "+ ans);
    sc.close();
    
  }
}
