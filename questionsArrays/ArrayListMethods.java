// Reverse and Sorting the ArrayList
import java.util.ArrayList;
import java.util.Collections;



public class ArrayListMethods {
  static void reverseArrayList(ArrayList<Integer> list){
    int i =0; 
    int j = list.size()-1;
    while (i<j) {
     // int temp = list.get(i);
     Integer temp = Integer.valueOf(list.get(i));
      list.set(i, list.get(j));
      list.set(j, temp);
  
      i++;
      j--;
    }
  }
  public static void main(String[] args) {
  ArrayList<Integer> list = new ArrayList<>();
  list.add(6);
  list.add(2);
  list.add(8);
  list.add(1);
  list.add(5);
  list.add(2,10);
  //list.remove(2);
  list.remove(Integer.valueOf(10));
  System.out.println(list);
  // reverseArrayList(list);
  Collections.reverse(list);
//  Collections.sort(list,Collections.reverseOrder());
  System.out.println(list);
  }
}
