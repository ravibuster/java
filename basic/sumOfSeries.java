import java.util.Scanner;
public class sumOfSeries {
  public static void main(String[] args) {
    System.out.print("Enter the Number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      if (i%2==0) {
        sum-=i;
      } else {
        sum+=i;
      }
    }
    System.out.println("sum of series is : "+ sum);
    sc.close();
  }
}

