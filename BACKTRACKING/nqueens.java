public class nqueens{
  public static void main(String args[]){
    int n = 4;
    char[][] board = new char[n][n];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        board[i][j] = 'X';
      }
    }
    nqueen(board,0);
  }

  private static void nqueen(char[][] board, int row) {
    int n = board.length;

    if (row == n) {
      for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[i].length; j++) {
          System.out.print(board[i][j]);
        }
        System.out.println();
      }
      System.out.println();
      return;
    }

    for (int j = 0; j < board.length; j++) {
      if (isSafe(board,row,j)) {
        board[row][j] = 'Q';
        nqueen(board, row+1);
        board[row][j] = 'X';      
      }
    }

  }

  private static boolean isSafe(char[][] board, int row, int col) {
    int n = board.length;
   // check W -> E
    for (int j = 0; j < board.length; j++) {
      if (board[row][j] == 'Q') {
        return  false;
      }
    }

  // check N -> S
    for (int i = 0; i < board.length; i++) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }

// check N-E
  int i = row;
  int j = col;
    while (i >= 0 && j < n) {
      if (board[i][j] == 'Q') {
        return false;
      }
      i--;
      j++;
    }
// check N-W
   i = row;
   j = col;
    while (i >= 0 && j >= 0) {
      if (board[i][j] == 'Q') {
        return false;
      }
      i--;
      j--;
   }

// check S-W
    i = row;
    j = col;
    while (i < n && j >= 0) {
      if (board[i][j] == 'Q') {
        return false;
      }
      i++;
      j--;
    }
// check S-E
  i = row;
  j = col;
    while (i < n && j < n) {
      if (board[i][j] == 'Q') {
        return false;
      }
      i++;
      j++;
    }
    return true;
  } 
}