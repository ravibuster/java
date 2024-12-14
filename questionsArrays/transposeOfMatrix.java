import java.util.Scanner;
public class transposeOfMatrix {
static void printArray(int[][] arr){
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
      System.out.print(arr[i][j] + " ");
    }
    System.out.println(" ");
  }
}
static int[][] transposeMatrix(int[][] arr,int r,int c){
  int [][] trans = new int[c][r];
  for (int i = 0; i < c; i++) {
    for (int j = 0; j < r; j++) {
     trans[i][j] = arr[j][i];
    }
  }
  return trans;
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

 
  System.out.println("matrix");
  printArray(matrice);
  int [][] transposeMatrix = new int[c][r];
  transposeMatrix = transposeMatrix(matrice, r, c);
  System.out.println("Multiplication matrice");
  printArray(transposeMatrix);
 
  sc.close();
}
}