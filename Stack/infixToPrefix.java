import java.util.Stack;

/// code for infix to postfix is same with slight change in while pushing string in val 
//write code (val1 + val2 + val3) 

public class infixToPrefix {
  public static void main(String[] args) {
    String str = "9-(5+3)*4/6";
    Stack<String> val = new Stack<>();
    Stack<Character> op = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      char ch  = str.charAt(i);
      int ascii = (int)ch;
      if (ascii>=48 && ascii<=57) val.push(""+ch);
      else if(op.size() == 0 || ch == '(' || op.peek() == '(') op.push(ch);
      else if(ch == ')'){
        while (op.peek() != '(') {
          String val2 = val.pop();
          String val1 = val.pop();
          char oper = op.peek();
          val.push(oper + val1 + val2);
          op.pop();
        }
        op.pop();
      }else{
        if (ch == '+' || ch == '-') {
          String val2 = val.pop();
          String val1 = val.pop();
          char oper = op.peek();
          val.push(oper + val1 + val2);
          op.pop();
          op.push(ch);
        }else if (ch == '*' || ch == '/') {
          if (op.peek() == '*' || op.peek() == '/') {
            String val2 = val.pop();
            String val1 = val.pop();
            char oper = op.peek();
            val.push(oper + val1 + val2);
            op.pop();
          }
          op.push(ch);
        }else op.push(ch);
      }
    }
    while (val.size() > 1) {
      String val2 = val.pop();
      String val1 = val.pop();
      char oper = op.peek();
      val.push(oper + val1 + val2);
      op.pop();
    }
    System.out.println(val.peek());
  }
}
