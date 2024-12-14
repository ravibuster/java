import java.util.Scanner;

public class binaryToDecimal {
  public static void main(String[] args) {
    System.out.print("Enter the Binary Number: ");
    Scanner sc = new Scanner(System.in);
    int binaryNumber = sc.nextInt();
    int n= binaryNumber;
    int pw = 1;
    int ans =0 ;

    while (n>0) {
      int unitDigit = n%10;
      ans += unitDigit*pw;
      pw*=2;
      n/=10;

    }

    System.out.println("Decimal Number is: " + ans);
    sc.close();
  }
  
}
