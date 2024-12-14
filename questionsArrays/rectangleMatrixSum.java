import java.util.Scanner;

public class rectangleMatrixSum {
  
  static void prefixSumMatrix(int[][] arr){
    int r = arr.length;
    int c;
    if (r>0){
      c = arr[0].length;
      //traversing the matrix horizontally
      for (int i = 0; i < r; i++) {
        for (int j = 1; j < c; j++) {
          arr[i][j] += arr[i][j-1];
        }
      }
      //traversing the matrix vertically
      for (int i = 1; i < r; i++) {
        for (int j = 0; j < c; j++) {
          arr[i][j] += arr[i-1][j];
        }
      }
    }
  }
  static int sumOfRectangle(int[][] arr, int r1,int c1,int r2, int c2){
    prefixSumMatrix(arr);
    int sum = 0, up = 0, down = 0, leftup =0;
    int ans=0;
    sum = arr[r2][c2];
    if (r1>0 && c1>0) {
      up = arr[r1-1][c2];
      down = arr[r2][c1-1];
      leftup = arr[r1-1][c1-1];
    }
    ans = sum - up - down + leftup;
    return ans;
  }
  public static void main(String[] args) {
    System.out.print("Enter the no. of rows and columns : ");
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] arr = new int[r][c]; 
    System.out.println("Enter the elements of matrix");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.print("Enter the first coordinate: ");
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    System.out.print("Enter the second coordinate : ");
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
    int sum =sumOfRectangle(arr, r1, c1, r2, c2);
    System.out.println(sum);
    sc.close();
  }
}
