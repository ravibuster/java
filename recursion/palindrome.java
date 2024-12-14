import java.util.Scanner;
public class palindrome {
  static boolean isPalindrome(String s, int l ,int r){
    if (l>=r) {
     return true; 
    }
    return s.charAt(l) == s.charAt(r) && isPalindrome(s, l+1, r-1);
  }
  public static void main(String[] args) {
    System.out.println("Enter the String");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(isPalindrome(s,0,s.length()-1));
    sc.close();
  }
}
