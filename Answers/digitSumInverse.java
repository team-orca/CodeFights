int digitSumInverse(int sum, int numberLength) {

  std::vector<int> line(numberLength * 9 + 1, 0);
  std::vector<std::vector<int>> dp(numberLength + 1, line);

  if (sum > 9 * numberLength) {
    return 0;
  }

  dp[0][0] = 1;
  for (int i = 0; i < numberLength; i++) {
    for (int j = 0; j <= i * 9; j++) {
      for (int digit = 0; digit < 10; digit++) {
        dp[i + 1][j + digit] += dp[i][j];
      }
    }
  }

  return dp[numberLength][sum];
}
