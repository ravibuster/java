import java.util.Scanner;
public class removeOccurences {
  // static String removeOccurenceElement(String str, char ch,int ind){
  //   if(ind == str.length()){
  //     return "";
  //   }
  //   String smallans = removeOccurenceElement(str, ch, ind+1);
  //   if (str.charAt(ind) != ch) {
  //     return str.charAt(ind)+ smallans;
  //   }

  //   return smallans;
  // }
  static String removeOccurenceElement(String str, char ch){
    if(str.length() == 0){
      return "";
    }
    String smallans = removeOccurenceElement(str.substring(1), ch);
    if (str.charAt(0) != ch) {    
      return str.charAt(0) + smallans;
    }

    return smallans;
  }
  // reverse the String
  // static String reverse(String str,int ind){
  //   if (ind>=str.length()) {
  //     return "";
  //   }
  //   String smallans = reverse(str, ind+1);
  //   return smallans + str.charAt(ind);
  // }
  static String reverse(String str){
    if (str.length()==0) {
      return "";
    }
    String smallans = reverse(str.substring(1));
    return smallans + str.charAt(0);
  }
  public static void main(String[] args) {
    System.out.println("Enter the String");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // System.out.println("Enter the Character you want to remove");
    // char ch = sc.next().charAt(0);
    // System.out.println(removeOccurenceElement(str, ch,0));
    // System.out.println(removeOccurenceElement(str, ch));
    // System.out.println(reverse(str,0));
    System.out.println(reverse(str));
    sc.close();

  }
}
