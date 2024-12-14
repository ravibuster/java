import java.util.Scanner;
public class frogJump {
static int cost(int [] arr, int ind){
  if (ind == arr.length-1) {
    return 0;
  }
  if (ind==arr.length-2) {
  int currentCost =Math.abs(arr[ind+1]-arr[ind]) ;
  return currentCost + cost(arr, ind+1);
  }
if (arr[ind+1]<arr[ind+2]) {
  int currentCost = arr[ind+1]-arr[ind];
  return currentCost + cost(arr, ind+1);
}else{
  int currentCost = Math.abs(arr[ind+2] - arr[ind]);
  return currentCost + cost(arr, ind+2);
}

}
public static void main(String[] args) {
  System.out.print("Enter the  Size of Array : ");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  System.out.println("Enter the Elements");
  int[] arr = new int[n];
  for (int i = 0; i < arr.length; i++) {
      arr[i]  = sc.nextInt();
  }
  System.out.println(cost(arr,0));
  sc.close();
}  
}
