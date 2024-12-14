import java.util.Scanner;

public class pRaiseToPowerQ {
  // static int powerFunction(int p, int q){
  //   if (q==0) {
  //     return 1;
  //   }
  //   return p * powerFunction(p, q-1);

  // }

  static int powerFunction(int p, int q){
    if (q==0) {
      return 1;
    }
    int smallPow = powerFunction(p, q/2);
    if(q%2==0) {
      return smallPow*smallPow;
    }
    return p *smallPow*smallPow ;

  }
  public static void main(String[] args) {
    System.out.print("enter the number : ");
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    System.out.print("enter the power : ");
    int q = sc.nextInt();
    int ans = powerFunction(p, q);
    System.out.println(ans);

    sc.close();
  }
}
