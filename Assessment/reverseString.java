public class reverseString {
  public static void main(String[] args) {
    String str = "My name is Ravi.";
    StringBuilder sb = new StringBuilder("");
    for (int i = str.length() -1; i >= 0; i--) {
      sb.append(str.charAt(i));
    }
    System.out.println(sb);
  }
}
