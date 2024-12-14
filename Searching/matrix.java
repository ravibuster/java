import java.util.Scanner;
public class matrix {
static void printArray(int[][] arr){
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
      System.out.print(arr[i][j] + " ");
    }
    System.out.println(" ");
  }
}
//all the elements are sorted of matrix
// static boolean isPresent(int[][] arr , int target , int r, int c){
//   int st = 0 , end = r*c-1;
//   while (st<=end) {
//     int mid = st + (end-st)/2;
//     int midElement = arr[mid/c][mid%c];
//     if (midElement == target) {
//       return true;
//     }else if(midElement < target ){
//       st = mid +1;
//     }else{
//       end = mid - 1; 
//     }
//   }
//   return false;
//}

// elemnents are sorted row wise and coloumn wise
static boolean isPresent(int[][] arr , int target , int r, int c){
  int i =0 ,  j = arr[0].length-1;
  while (i<r && j>=0) {
    if (arr[i][j]==target) {
      return true;
    }else if(arr[i][j]<target){
      i++;
    }else{
      j--;
    }
  }
  return false;
}
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of rows of matrix");
  int r = sc.nextInt();
  System.out.println("Enter the no. of columns");
  int c = sc.nextInt();
  int [][] matrice = new int[r][c];
  
  System.out.println("Enter the elements of matrix");
  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      matrice[i][j] = sc.nextInt();
    }
  }

  System.out.println("matrix");
  printArray(matrice);
  
  System.out.println("Enter the target elements");
  int target = sc.nextInt();

  System.out.println(isPresent(matrice, target, r, c));
 
  sc.close();
}
}