import java.util.Scanner;

public class gcd {
  //brute force

//  static int hcf(int n1, int n2,int a, int b){
  
//   if (n1==n2) {
//     return n1;
//   }
//   if (n1==1||n2==1) {
//     return 1;
//   }
//   if (n1>n2) {
//     return a%n2==0 && b%n2==0 ?n2:hcf(n1, n2-1,a,b);
//   }else{
//     return b%n1==0 && a%n1==0? n1:hcf(n1-1, n2,a,b);
//   }

// }

// iterative 
static int hcf(int n1, int n2){
  while (n1%n2!=0) {
    int rem = n1%n2;
    n1=n2;
    n2=rem;
  }
  return n2;
}

//Recursive
// static int hcf(int n1, int n2){
//   if (n2==0) {
//     return n1;
//   }
//   return hcf(n2, n1%n2);
// }


// gcd * lcm = x * y


  public static void main(String[] args) {
    System.out.print("enter the first number : ");
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    System.out.print("enter the second number : ");
    int n2 = sc.nextInt();
    // int ans = hcf(n1,n2,n1,n2);
    int ans = hcf(n1,n2);
    System.out.println(ans);

    sc.close();
  }
}