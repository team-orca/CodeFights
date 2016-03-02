int toAndFro(int a, int b, int t) {

  int len =  Math.abs(a-b);
  t %= (2 * len);
  if (t <= len) {
    return a + (b - a) / Math.abs(b - a) * t;
  }
  else {
    t -= len;
    return b + (a - b) / Math.abs(a - b) * t;
  }
}
