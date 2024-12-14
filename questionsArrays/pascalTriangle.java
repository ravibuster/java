import java.util.Scanner;
public class pascalTriangle {
static void printArray(int[][] arr){
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
      System.out.print(arr[i][j] + " ");
    }
    System.out.println(" ");
  }
}
static void createPascalTriangle(int n){
  int[][] triangle = new int[n][];
  for (int i = 0; i < n; i++) {
    triangle[i] = new int[i+1];
    for (int j = 0; j <=i; j++) {

      if (j==0||j==i) {
        triangle[i][j]=1;
      }else{
        triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
      }
    }
  }
  printArray(triangle);
}  

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of pascal Triangle");
  int n = sc.nextInt();
  System.out.println("pascal Triangle");
  createPascalTriangle(n);
 
  sc.close();
}
}