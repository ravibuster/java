import java.util.Scanner;
public class multiplicationOfmatrices {
static void printArray(int[][] arr){
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
      System.out.print(arr[i][j] + " ");
    }
    System.out.println(" ");
  }
}
static int[][] matricesMultiplication(int[][] arr1,int r1,int c1, int[][] arr2,int r2, int c2){
  int [][] mul = new int[r1][c2];
  for (int i = 0; i < r1; i++) {
    for (int j = 0; j < c2; j++) {
     for (int k = 0; k < c1; k++) {
      mul[i][j] += arr1[i][k] * arr2[k][j];
     }
    }
  }
  return mul;
}  
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of rows in first matrix");
  int r1 = sc.nextInt();
  System.out.println("Enter the number of columns in first matrix");
  int c1 = sc.nextInt();
  System.out.println("Enter the elements of first matrix of "+ r1 + " x " + c1);
  int [][] matrice1 = new int[r1][c1];
  
  for (int i = 0; i < r1; i++) {
    for (int j = 0; j < c1; j++) {
      matrice1[i][j] = sc.nextInt();
    }
  }

  System.out.println("Enter the number of rows in second matrix");
  int r2 = sc.nextInt();
  System.out.println("Enter the number of columns in second matrix");
  int c2 = sc.nextInt();
  int [][] matrice2 = new int[r2][c2];
  System.out.println("Enter the elements of second matrix of "+ r2 + " x " + c2);
 
  for (int i = 0; i < r2; i++) {
    for (int j = 0; j < c2; j++) {
      matrice2[i][j] = sc.nextInt();
    }
  } 
  System.out.println("matrix 1");
  printArray(matrice1);
  System.out.println("matrix 2");
  printArray(matrice2);
  if (c1==r2) {
    int [][] multiplicationMatrice = new int[r1][c2];
    multiplicationMatrice = matricesMultiplication(matrice1, r1, c1, matrice2, r2, c2);
    System.out.println("Multiplication matrice");
    printArray(multiplicationMatrice);
  }else{
    System.out.println("multiplication is not possible");
  }
 
  sc.close();
}
}