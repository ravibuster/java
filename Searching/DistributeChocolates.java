import java.util.Scanner;
public class DistributeChocolates {
  static Boolean isDivisionPossible(int arr[], int m,int maxChocoAllowed){
    int numOfStudents = 1;
    int choco = 0;
    for (int i = 0 ; i < arr.length ; i++) {
      if (arr[i]>maxChocoAllowed) {
        return false;
      }
      if (arr[i] + choco <= maxChocoAllowed) {
        choco += arr[i];
      }else{
        numOfStudents++;
        choco = arr[i] ;
      }
     
    }
    if (numOfStudents>m) {
      return false;
    }
    return true;
  }
  static int distributeChocolates(int[] arr, int m){
    int ans = 0, st = 1, end = (int)1e9;
    if (arr.length<m) {
      return -1;
    }
    while (st<=end) {
      int mid = st + (end-st)/2;
      if (isDivisionPossible(arr, m, mid)) {
        ans = mid;
        end = mid -1;
      }else{
        st = mid + 1;
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

    System.out.println(distributeChocolates(arr, m));

    sc.close();
  }
}
