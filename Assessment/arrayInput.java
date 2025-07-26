
import java.util.*;
public class arrayInput {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<Integer>();
    String str1 = sc.nextLine().trim();
    for(char ch : str1.toCharArray()){
      if (Character.isDigit(ch)){
        arr.add(Character.getNumericValue(ch));
    }
    sc.close();
    }
    for (int i = 0; i < arr.size(); i++){
      System.out.print(arr.get(i) + " ");
    }
  }
}
