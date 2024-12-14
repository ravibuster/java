public class mazePath3 {
  static void mazePath4D(int sr, int sc, int er, int ec, String s, int[][] maze) {
   if (sc < 0 || sr < 0) return;
   if (sc > ec || sr > er) return;
   if (maze[sr][sc] == 0) return;
   if (sc == ec && sr == er) {
    System.out.println(s);
    return;
   }
   if (maze[sr][sc] == -1) return;
   maze[sr][sc] = -1;
   //  rightway
   mazePath4D(sr, sc + 1, er, ec, s + "R", maze);
   //  downway
   mazePath4D(sr + 1, sc , er, ec, s + "D", maze);
   // leftway
   mazePath4D(sr, sc - 1, er, ec, s + "L", maze);
   // upway
   mazePath4D(sr - 1, sc, er, ec, s + "U", maze);

   maze[sr][sc] = 1;
   
  }
  public static void main(String[] args) {
    int rows = 3;
    int col = 4;
    int[][] maze = {
      {1,0,1,1},
      {1,1,1,1},
      {1,1,0,1}
    };
    String s = "";
    mazePath4D(0,0,rows-1,col-1 ,s,maze);
  }

 
}

