public class passwordString {
  public static void main(String[] args) {
    String pwd = "100110";
    int count = 0;
    for (int i = 0 ; i < pwd.length() -1 ; i += 2) {
      if (pwd.charAt(i) != pwd.charAt(i+1)) {
        count++;
      }
    }
    System.out.println(count);
  }
}
