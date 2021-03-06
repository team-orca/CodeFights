int subarrayCount(int[] a, int k) {

  int result = 0;
  int left = 0;
  for (int i = 0; i <= a.length; i++) {
    if (i == a.length || a[i] <= k) {
      result += (i - left) * (i - left + 1) / 2;
      left =  i+1 ;
    }
  }

  return result;
}
