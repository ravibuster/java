import java.util.Scanner;

public class kMultiplesOfnum {
  
  static void powerFunction(int num, int k){
    if(k==1){
      System.out.print(num*k);
      return;
    }
    powerFunction(num, k-1);
    System.out.print(","+num*k);
  }
  public static void main(String[] args) {
    System.out.print("enter the number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.print("enter the value k : ");
    int k = sc.nextInt();
    powerFunction(num, k);

    sc.close();
  }
}