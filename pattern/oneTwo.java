import java.util.Scanner;
public class oneTwo {
  public static void main(String[] args) {
  System.out.println("Enter the no. of rows : ");
  Scanner sc = new Scanner(System.in);
  int r = sc.nextInt();
  System.out.println("Enter the no. of cloumns : ");
  int c = sc.nextInt();

  for (int i = 1; i <= r; i++) {
    for (int j = 1; j <= c; j++) {
      if((i+j)%2==0){
        System.out.print(1);
      }else{
        System.out.print(2);
      }
    }
    System.out.println();
  }
  sc.close();
  }
}
