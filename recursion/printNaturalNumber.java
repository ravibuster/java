import java.util.Scanner;

public class printNaturalNumber {
//   static void printIncreasingNumber(int n){
//     if (n==1) {
//       System.out.println(n);
//       return;
//     }

//     printIncreasingNumber(n-1);
//     System.out.println(n);
//   }


  static void printDecreasingNumber(int n){
    if (n==1) {
      System.out.println(n);
      return;
    }
    System.out.println(n);
    printDecreasingNumber(n-1);
  }

  public static void main(String[] args) {
    System.out.print("Enter the number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // printIncreasingNumber(n);
    printDecreasingNumber(n);
    sc.close();
  }
}
