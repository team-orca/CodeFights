int axisAlignedBoundingBox(int[] x, int[] y) {

  int mx = x[0], nx = x[0],my = y[0], ny = y[0];

  for (int i = 1; i < x.length; i++) {
    mx = Math.min(x[i], mx);
    nx = Math.max(x[i], nx);
    my = Math.min(y[i], my);
    ny = Math.max(y[i], ny);
  }

  return (mx - nx) * (my - ny);
}
