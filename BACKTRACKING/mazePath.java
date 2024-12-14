public class mazePath{
  // static int totalPath(int sr,int sc,int er,int ec){
  //   if(sc > ec || sr > er){
  //     return 0;
  //   }
  //   if(sc == ec && sr == er) return 1;

  //   int rightWays = totalPath(sr , sc+1, er , ec);
  //   int downways = totalPath(sr + 1 , sc, er , ec);
  //   return rightWays + downways;
  // }

  //print path
  static void printPath(int sr,int sc,int er,int ec ,String s){
    if(sc > ec || sr > er){
      return ;
    }
    if(sc == ec && sr == er){
      System.out.println(s);
      return;
    }
    printPath(sr+1, sc, er, ec, s + "D");
    printPath(sr, sc +1, er, ec, s + "R");
  }
  public static void main(String args[]){
    int rows = 3;
    int col = 3;
   // int totalPath =  totalPath(1,1,rows,col);
   // System.out.println(totalPath);
   printPath(1,1,rows,col , "");
  }
}