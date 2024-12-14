import java.util.Scanner;
public class matrixToSpiral {
static void printArray(int[][] arr){
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
      System.out.print(arr[i][j] + " ");
    }
    System.out.println(" ");
  }
}
static void printElementSpirally(int[][] arr,int r,int c){
  int toprow = 0, bottomrow = r-1, leftcolumn = 0, rightcolumn = c-1;
  int totalElements = r*c;
  while (totalElements!=0) {
    // print the top row
    for (int i = leftcolumn; i <= rightcolumn; i++) {
      System.out.print(arr[toprow][i]+" ");
      totalElements--;
    }
    toprow++;
    // print the right column
    for (int i = toprow; i <= bottomrow; i++) {
      System.out.print(arr[i][rightcolumn]+" ");
      totalElements--;
    }
    rightcolumn--;
    // print the bottom row in reverse direction
    for (int j = rightcolumn; j >= leftcolumn; j--) {
      System.out.print(arr[bottomrow][j]+" ");
      totalElements--;
    }
    bottomrow--;
    // print the left column
    for (int j = bottomrow; j >= toprow; j--) {
      System.out.print(arr[j][leftcolumn]+" ");
      totalElements--;
    }
    leftcolumn++;
  }
}  

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of rows in matrix");
  int r = sc.nextInt();
  System.out.println("Enter the number of columns in matrix");
  int c = sc.nextInt();
  System.out.println("Enter the elements of matrix of "+ r + " x " + c );
  int [][] matrice = new int[r][c];
  
  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      matrice[i][j] = sc.nextInt();
    }
  }

  System.out.println("Matrix");
  printArray(matrice);
  System.out.println("Elements of matrix in spiral form");
  printElementSpirally(matrice, r, c);
 
  sc.close();
}
}
