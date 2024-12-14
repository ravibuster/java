import java.util.Scanner;
public class RaceTrack {
  static Boolean isDivisionPossible(int arr[], int m,int minDistance){
    int kidPlaced = 1;
    int distance = arr[0];
    for (int i = 1 ; i < arr.length ; i++) {
      if (arr[i]-distance  >= minDistance) {
        kidPlaced++;
        distance = arr[i];
      }
      
    }
    if (kidPlaced>=m) {
      return true;
    }
    return false;
  }
  static int maximumDistance(int[] arr, int m){
    int ans = 0, st = 1, end = (int)1e9;
    if (arr.length<m) {
      return -1;
    }
    while (st<=end) {
      int mid = st + (end-st)/2;
      if (isDivisionPossible(arr, m, mid)) {
        ans = mid;
        st = mid + 1;
      }else{
        end = mid -1;
      }

    }
    return ans;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the Elements of Array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the no. of students");
    int m = sc.nextInt();

    System.out.println(maximumDistance(arr, m));

    sc.close();
  }
}

