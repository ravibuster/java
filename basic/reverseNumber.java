import java.util.Scanner;
public class reverseNumber {
  public static void main(String[] args) {
    System.out.print("Enter the Number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int ans =0;
    while (num>0) {
      int unitDigit = num%10;
      ans = ans *10 + unitDigit;
      num/=10;
     
    }
    System.out.println("reverse number is : "+ ans);
    sc.close();
  }
}
