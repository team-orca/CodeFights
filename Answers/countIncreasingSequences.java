int countIncreasingSequences(int n, int k) {

  /*
   * vector dp (short for dynamic programming)
   * is used for storing the interim values.
   */
  int[] line = new int[k + 1];
  int[][] dp = new int[n + 1][line.length];
  dp[0][0] = 1;

  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= k; j++) {
      for (int q = 0; q < j; q++) {
        dp[i][j] += dp[i - 1][q];
      }
    }
  }

  int sum = 0;
  for (int j = 1; j <= k; j++) {
    sum += dp[n][j];
  }

  return sum;
}
