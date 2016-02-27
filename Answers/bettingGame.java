boolean bettingGame(int[] L) {

  int s = 0;
  for (int i = 0; i < L.length; i++) {
    s += L[i];
  }
  if (s == 0) {
    return false;
  }

  return s % L.length == 0;
}
