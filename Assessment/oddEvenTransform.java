
public class oddEvenTransform {
 public static void main(String[] args) {
  int[] num = {3,4,9};
  int n = 4;
  if (n%2 != 0) {
    for (int i = 0; i < num.length; i++) {
      if (i%2 == 0) {
        num[i] += 3;
      }else{
        num[i] -= 3;
      }
    }
  }
  for (int i = 0; i < num.length; i++) {
    System.out.println(num[i]);
  }
 } 
}
