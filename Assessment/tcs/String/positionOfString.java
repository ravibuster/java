// package tcs.String;
import java.util.*;
public class positionOfString {
  public static void main(String[] args){
    Scanner sc  =new Scanner(System.in);
    System.out.println("Enter the first string:");
    String s1= sc.next();
    System.out.println("Enter the second string:");
    String s2= sc.next();
    int ind = s1.indexOf(s2);
    System.out.println(ind); 

  }
}
