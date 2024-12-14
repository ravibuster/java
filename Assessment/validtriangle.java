public class validtriangle {
  public static void main(String[] args) {
    String[] triangle = {"221","333","345","113"};
    int[] sides = new int[3];
    for (int i = 0; i < triangle.length; i++) {
      for (int j = 0; j < 3; j++) {
        sides[j] = Character.getNumericValue(triangle[i].charAt(j));
      }
      if (sides[0] + sides[1] > sides[2] || sides[1] + sides[2] > sides[0] || sides[0] + sides[2] > sides[1]) {
        if (sides[0] == sides[1] && sides[1] == sides[2]) {
          System.out.println("Equilateral");
        }else if (sides[0] == sides[1] || sides[1] == sides[2] 
        || sides[0] == sides[2]) {
          System.out.println("isosceles");
        }else{
          System.out.println("not a valid Triangle");
        }
      }else{
        System.out.println("not a valid Triangle");
      }
    }
  }
}
