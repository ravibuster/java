// import java.util.ArrayList;
import java.util.Scanner;
public class subsequences {
  // static ArrayList<String> returnSubsquences(String s,int ind) {
  //   ArrayList<String> ans = new ArrayList<>();
  //   if (ind == s.length() ) {
  //     ans.add("");
  //     return ans;
  //   }
  //   char currentChar= s.charAt(ind);
  //   ArrayList<String> smallans = returnSubsquences(s, ind+1) ;
  //   for(String ss:smallans){
  //     ans.add(currentChar+ss);
  //     ans.add(ss);
  //   }
  //   return ans;
  // }
  static void returnSubsquences(String s,String currentAns,int ind) {
    if (ind == s.length()) {
      System.out.print(currentAns+" "); 
      return;
    }
    char currentChar= s.charAt(ind);
    returnSubsquences(s, currentAns + currentChar, ind+1);//include current character
    returnSubsquences(s, currentAns, ind+1);// //exclude current character
  }
  // static void returnSubsquencesSum(int[] arr ,int currentAns,int ind) {
  //   if (ind == arr.length) {
  //     System.out.print(currentAns + " "); 
  //     return;
  //   }
  //   int currentElement= arr[ind];
  //   returnSubsquencesSum(arr, currentAns + currentElement, ind+1);//include current element
  //   returnSubsquencesSum(arr, currentAns, ind+1);// //exclude current element
    
  // }
  public static void main(String[] args) {
    // System.out.println("Enter the String");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    // System.out.println(returnSubsquences(s, 0));
    // ArrayList <String> ans = returnSubsquences(s, 0);
    // for(String ss:ans){
    //  System.out.print(ss + " ");
    // }
   returnSubsquences(s, "", 0);
  //  System.out.println("enter the Size of Array");
  //  int n = sc.nextInt();
  //  int[] arr = new int[n];
  //  System.out.println("Enter the Elements");
  //  for (int i = 0; i < arr.length; i++) {
  //     arr[i] = sc.nextInt(); 
  //  }
  //  returnSubsquencesSum(arr, 0, 0);
    sc.close();
  }
}
