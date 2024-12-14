import java.util.Scanner;

public class sumOfDigit {
  public static void main(String[] args) {
    System.out.print("Enter the Number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum =0;
    
    while (num>0) {
      sum+=num%10;
      num/=10;
    }
    System.out.println(sum);
    sc.close();
  }
}
