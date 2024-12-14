public class distinctTriplet {
  public static void main(String[] args) {
    int[] price = {3,3,4,7,8};
    int d = 5;
    int count = 0;

    for (int i = 0; i < price.length; i++) {
      for (int j = i+1; j < price.length; j++) {
        for (int k = j+1; k < price.length; k++) {
          if ((price[i] + price[j] + price[k])%d == 0) {
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}
