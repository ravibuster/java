import java.util.Scanner;
public class factorial {
  public static void main(String[] args) {
    System.out.print("Enter the Number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int factorial =1;
      
    for (int i = 1; i <= num; i++) {
      factorial*=i;
    }
    
    
    System.out.println("factorial of " + num +" is : " + factorial);
    sc.close();
  }
}


