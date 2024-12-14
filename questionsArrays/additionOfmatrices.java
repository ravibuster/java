import java.util.Scanner;
public class additionOfmatrices {
static void printArray(int[][] arr){
  System.out.println("Addition matrice");
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
      System.out.print(arr[i][j] + " ");
    }
    System.out.println(" ");
  }
}
static int[][] matricesAddition(int[][] arr1, int[][] arr2,int r, int c){
  int [][] addition = new int[r][c];
  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      addition[i][j] = arr1[i][j] + arr2[i][j];
    }
  }
  return addition;
}  
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of rows in matrices");
  int r = sc.nextInt();
  System.out.println("Enter the number of columns in matrices");
  int c = sc.nextInt();
  System.out.println("Enter the elements of first matrices of "+ r + " x " + c);
  int [][] matrice1 = new int[r][c];
  int [][] matrice2 = new int[r][c];
  int [][] additionMatrice= new int[r][c];
  
  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      matrice1[i][j] = sc.nextInt();
    }
  }
  System.out.println("Enter the elements of second matrices of "+ r + " x " + c);
 
  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      matrice2[i][j] = sc.nextInt();
    }
  } 

  additionMatrice = matricesAddition(matrice1, matrice2, r, c);
  printArray(additionMatrice);
  sc.close();
}
}