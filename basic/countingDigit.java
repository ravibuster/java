import java.util.Scanner;
public class countingDigit {
  public static void main(String[] args) {
    System.out.print("Enter the Number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count =num==0?1:0;
    
    while (num>0) {
      num/=10;
      count++;
    }
    System.out.println(count);
    sc.close();
  }
}
