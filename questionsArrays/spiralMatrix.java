import java.util.Scanner;
public class spiralMatrix {
static void printArray(int[][] arr){
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
      System.out.print(arr[i][j] + " ");
    }
    System.out.println(" ");
  }
}
static void createSpiralMatrix(int n){
  int toprow = 0, bottomrow = n-1, leftcolumn = 0, rightcolumn = n-1;
  int totalElements = n*n;
  int[][] arr = new int[n][n];
  int count =1;
  while (totalElements!=0) {
    // print the top row
    for (int i = leftcolumn; i <= rightcolumn; i++) {
      arr[toprow][i]=count;
      totalElements--;
      count++;
    }
    toprow++;
    // print the right column
    for (int i = toprow; i <= bottomrow; i++) {
      arr[i][rightcolumn]=count;
      totalElements--;
      count++;
    }
    rightcolumn--;
    // print the bottom row in reverse direction
    for (int j = rightcolumn; j >= leftcolumn; j--) {
      arr[bottomrow][j]=count;
      totalElements--;
      count++;
    }
    bottomrow--;
    // print the left column
    for (int j = bottomrow; j >= toprow; j--) {
      arr[j][leftcolumn]=count;
      totalElements--;
      count++;
    }
    leftcolumn++;
  }
  printArray(arr);
}  

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of size of Spiral matrix");
  int n = sc.nextInt();
  
  System.out.println(" Spiral Matrix");
  createSpiralMatrix(n);
  sc.close();
}
}