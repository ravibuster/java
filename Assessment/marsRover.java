public class marsRover {
  public static void main(String[] args) {
    int n = 4;
    String[] commands = {"RIGHT","UP","DOWN","LEFT","DOWN","DOWN"};
    int row = 0;
    int col = 0;
    for (int i = 0; i < commands.length; i++) {
      if (commands[i] == "RIGHT" && col < n) {
        col++;
      }
      if (commands[i] == "UP" && row > 0) {
        row--;
      }
      if (commands[i] == "DOWN" && row < n) {
        row++;
      }
      if (commands[i] == "LEFT" && col > 0) {
        col--;
      }
    }
    System.out.println(row*n+col);
  }
}
