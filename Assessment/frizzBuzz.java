public class frizzBuzz {
  public static void main(String[] args) {
    int n = 15;
    for (int i = 1; i <= n; i++) {
      if (i%3 == 0 && i%5 == 0) {
        System.out.println("frizzBuzz");
      }else if (i%3 == 0) {
        System.out.println("fizz");
      }else if (i%5 == 0) {
        System.out.println("Buzz");
      }else{
        System.out.println(i);
      }
    }
  }
}
