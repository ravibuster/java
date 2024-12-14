
public class substringRemoval {
  public static void main(String[] args) {
    String str  = "BABBA";
    String str1  = "AB";
    String str2  = "BB";
    boolean flag = true;

    while (flag) {
      flag = false;
      if (str.contains(str1)) {
       str = str.replace(str1, "");
        flag = true;
      }
      if (str.contains(str2)) {
        str = str.replace(str2, "");
        flag = true;
      }
    }
    System.out.println(str);
  }
}
