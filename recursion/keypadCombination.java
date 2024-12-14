import java.util.Scanner;
public class keypadCombination {
  static void combination(String digi,String[] kp , String res){
    if (digi.length()==0) {
      System.out.print(res+ " ");
      return;
    }
    int currentNumber = digi.charAt(0)-'0';
    String choices = kp[currentNumber];
    for (int i = 0; i <choices.length(); i++) {
      combination(digi.substring(1), kp, res + choices.charAt(i));
    }
  }
  public static void main(String[] args) {
    System.out.print("enter the no.: ");
    Scanner sc = new Scanner(System.in);
    String digi = sc.next();
    String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    combination(digi, kp, "");
    sc.close();
  }
}
