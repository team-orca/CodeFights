int zigzag(int[] a) {

  int best = 1;
  int left = 0;
  while (left < a.length) {
    int right = left + 1;
    while (right < a.length) {
      if (right == left + 1) {
        if (a[left] == a[right]) {
          break;
        }
      } else {
        if ((a[right - 1] - a[right - 2]) * (a[right - 1] - a[right]) <= 0) {
          break;
        }
      }
      right++;
    }
      best=Math.max(best,right-left);
      left=right;
    if (left < a.length && a[left - 1] != a[left]) {
      left--;
    }
  }

  return best;
}
