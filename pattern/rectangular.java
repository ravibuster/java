import java.util.Scanner;
public class rectangular {
  public static void main(String[] args) {
  System.out.println("Enter the no. of rows : ");
  Scanner sc = new Scanner(System.in);
  int r = sc.nextInt();
  System.out.println("Enter the no. of cloumns : ");
  int c = sc.nextInt();

  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      System.out.print("*");
    }
    System.out.println();
  }
  sc.close();
  }
}
