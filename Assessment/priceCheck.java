import java.util.HashMap;
import java.util.Map;

class priceCheck {
  public static void main(String[] args) {
    
    String[] products = {"eggs", "milk", "cheese"};
    double[] productPrice = {2.89,3.29,5.79};
    String[] productSold = {"eggs", "eggs", "cheese","milk"};
    double[] soldPrice = {2.89,2.99,5.79,3.29};

    int error = 0;

    Map<String,Double> mp = new HashMap<>();
    for (int i = 0; i < products.length; i++) {
      mp.put(products[i],productPrice[i]);
    }

    for (int i = 0; i < soldPrice.length; i++) {
      if (mp.containsKey(productSold[i])) {
        if (mp.get(productSold[i]) != soldPrice[i]) {
          error++;
        }
      }
    }
   
    System.out.println(error);

  }  
}