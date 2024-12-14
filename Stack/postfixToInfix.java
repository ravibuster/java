import java.util.Stack;

/// code for infix to postfix is same with slight change in while pushing string in val 
//write code (val1 + val2 + oper) 

public class postfixToInfix {
  public static void main(String[] args) {
    String str = "953+4*6/-"; // 
    Stack<String> val = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      char ch  = str.charAt(i);
      int ascii = (int)ch;
      if (ascii>=48 && ascii<=57) val.push(""+ch);
      else{
        String val2 = val.pop();
        String val1 = val.pop();
        val.push('(' +val1 + ch + val2 + ')');
      }
    }
    System.out.println(val.peek());
  }
}

