public class mazePath2 {
  static void mazePath4D(int sr, int sc, int er, int ec, String s, boolean[][] isVisted) {
   if (sc < 0 || sr < 0) return;
   if (sc > ec || sr > er) return;
   if (isVisted[sr][sc] == true) return;
   if (sc == ec && sr == er) {
    System.out.println(s);
    return;
   }
   isVisted[sr][sc] = true;
   //  rightway
   mazePath4D(sr, sc + 1, er, ec, s + "R", isVisted);
   //  downway
   mazePath4D(sr + 1, sc , er, ec, s + "D", isVisted);
   // leftway
   mazePath4D(sr, sc - 1, er, ec, s + "L", isVisted);
   // upway
   mazePath4D(sr - 1, sc, er, ec, s + "U", isVisted);

   //isVisted[sr][sc] = false;
   
  }
  public static void main(String[] args) {
    int rows = 3;
    int col = 3;
    boolean[][] isVisted = new boolean[rows][col];
    String s = "";
    mazePath4D(0,0,rows-1,col-1 ,s,isVisted);
  }

 
}
