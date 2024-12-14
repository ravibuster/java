import java.util.Scanner;
public class hollowRectangular {
  public static void main(String[] args) {
    System.out.print("Enter the no. of rows : ");
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    System.out.print("Enter the no. of cloumns : ");
    int c = sc.nextInt();
  
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <=c; j++) {
        if(i==1||j==1||i==r||j==c){
          System.out.print(j);
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    sc.close();
    }
}
