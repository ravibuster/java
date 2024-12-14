import java.util.Scanner;

public class hollowPyramid{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    // int c = sc.nextInt();

    for (int i = 1; i <= r; i++) {

      for (int j = 1; j <= r-i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= 2*i-1; j++) {
        if (j==1 || j==2*i-1) {
          System.out.print(i);
        }else if(i==r){
          System.out.print(i);
        }else{
          System.out.print(" ");
        }
        
      }
      System.out.println();
    }
    sc.close();

  }
}