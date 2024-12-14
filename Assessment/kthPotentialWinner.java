public class kthPotentialWinner {
  public static void main(String[] args) {
    int[] arr ={3,2,1,4};
    int k = 2;
    int count = 0;
    for (int i = 1; i < arr.length ; i++) {
      if (count == k) {
        System.out.println(arr[0]);
        break;
      }
      if (arr[0] < arr[i]) {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
        
      }
      count++;
    }
  }
}
