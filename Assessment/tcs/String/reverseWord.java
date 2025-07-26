// package tcs.String;
import java.util.*;

public class reverseWord {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string to reverse the words:");
    String str = sc.nextLine();
    str = str.trim();
    String[] words = str.split("\\s+");
    StringBuilder sb =new StringBuilder();
    for(int i = words.length -1 ; i >= 0 ; i--){
      sb.append(words[i]);
      if( i != 0){
        sb.append(" ");
      }
    }
    System.out.println(sb.toString());
  }
}
