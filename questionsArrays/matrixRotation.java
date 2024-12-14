import java.util.Scanner;
public class matrixRotation {
static void printArray(int[][] arr){
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
      System.out.print(arr[i][j] + " ");
    }
    System.out.println(" ");
  }
}
static void transposeMatrix(int[][] arr,int r,int c){
  for (int i = 0; i < c; i++) {
    for (int j = i; j < r; j++) {
     int temp = arr[i][j];
     arr[i][j] = arr[j][i];
     arr[j][i] = temp;
    }
  }
}  
static void reverseArray(int[] arr){
  int i=0;
  int j=arr.length-1;
  while (i<j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    i++;
    j--;
  }
}
static void rotateMatrix(int[][] arr, int n){
  transposeMatrix(arr, n, n);
  for (int i = 0; i < arr.length; i++) {
    reverseArray(arr[i]);
  }
}
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of size of square matrix");
  int n = sc.nextInt();
  int [][] matrice = new int[n][n];
  
  System.out.println("Enter the elements of matrix");
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      matrice[i][j] = sc.nextInt();
    }
  }

  System.out.println("matrix");
  printArray(matrice);
  rotateMatrix(matrice, n);
  System.out.println("Rotated matrice");
  printArray(matrice);
 
  sc.close();
}
}