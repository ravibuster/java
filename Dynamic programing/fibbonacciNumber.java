public class fibbonacciNumber {
  public static void main(String[] args) {
    int n = 4;
    int[] dp = new int[n +1];
    for (int i = 0; i < dp.length; i++) {
      dp[i] = -1;
    }
    int ans = fibbonaciSeries(n, dp);
    System.out.println(ans);
  }

   // Bottom Up Approach
  private static int fibbonaciSeries(int n, int[] dp) {
    dp[0] = 0;
    dp[1] = 1;
    for (int i = 2; i < dp.length; i++) {
      dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
  }

  // Space Optimization
  // private static int fibbonaciSeries(int n, int[] dp) {
  //  int prev1 = 0;
  //  int prev2 = 1;
  //  int curr;

  //  if (n == 0) {
  //   return 0;
  //  }
  //   for (int i = 2; i < dp.length; i++) {
  //     curr = prev1 + prev2;
  //     prev1 = prev2;
  //     prev2 = curr;
  //   }
  //   return prev1;
  // }

  // Top down Approach
  
  // private static int fibbonaciSeries(int n, int[] dp) {
  //   if (n == 0 || n == 1) {
  //     return n;
  //   }
  //   if (dp[n] != -1) {
  //     return dp[n];
  //   }
  //   dp[n] = fibbonaciSeries(n-1, dp) + fibbonaciSeries(n - 2, dp);
  //   return dp[n] ; 
  // }

 
}
