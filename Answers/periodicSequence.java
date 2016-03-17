int periodicSequence(int S0, int A, int B, int M) {

  int[] occurrence = new int[M];
  int currentValue = S0;

  for (int i = 0; i < M; i++) {
    occurrence[i] = -1;
  }
  occurrence[S0] = 0;

  for (int i = 1; ; i++) {
    currentValue = (A * currentValue + B) % M;
    if (occurrence[currentValue] != -1) {
      return i - occurrence[currentValue];
    }
    occurrence[currentValue] = i;
  }
}
