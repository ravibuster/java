public class Knight {
 static int maxKnight =-1;
  public static void main(String[] args) {
    int n =3;
    char[][] board = new char[n][n];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        board[i][j] = 'x';
      }
    }
    helper(board , 0 , 0 , 0);
    System.out.println(maxKnight);
  }

  private static void helper(char[][] board, int row, int col, int num) {
   int n = board.length;

   if (row == n) {
    // if (num > n) {
    //   for (int i = 0; i < board.length; i++) {
    //     for (int j = 0; j < board.length; j++) {
    //       System.out.print(board[i][j] + " ");
    //     }
    //     System.out.println();
    //   }
    //   System.out.println();
    // }
    maxKnight = Math.max(num, maxKnight);
    return ;

   }

   if(isSafe(board,row,col)){
    board[row][col] = 'k';
    if (col < n-1) {
      helper(board, row , col + 1, num + 1);
    }else{
      helper(board, row +1, 0, num + 1);
    }
    board[row][col] = 'x';
   }
  if (col < n-1) {
    helper(board, row , col + 1, num);
  }else{
    helper(board, row +1, 0, num);
  }
  board[row][col] = 'x';
  }

  private static boolean isSafe(char[][] board, int row, int col) {
    int n = board.length;

    int i = row - 2;
    int j = col + 1;

    // up - right
    if( i >= 0 && j < n && board[i][j] == 'k') return false ; 

    i = row - 2;
    j = col - 1;

    // up - left
    if( i >= 0 && j >= 0 && board[i][j] == 'k') return false ; 

    i = row + 2;
    j = col - 1;

    // down - left
    if( i < n && j >= 0 && board[i][j] == 'k') return false ; 

    i = row + 2;
    j = col + 1;

    // down - right
    if( i < n && j < n && board[i][j] == 'k') return false ; 

    i = row - 1;
    j = col - 2;

    //  left - up
    if( i >= 0 && j >= 0 && board[i][j] == 'k') return false ; 

    i = row + 1;
    j = col - 2;

    //  left - down
    if( i < n && j >= 0 && board[i][j] == 'k') return false ; 

    i = row - 1;
    j = col + 2;

    //  right - up
    if( i >= 0 && j < n && board[i][j] == 'k') return false ; 

    i = row + 1;
    j = col + 2;

    //  right -down
    if( i < n && j < n && board[i][j] == 'k') return false ; 

    return true;
  }
}
