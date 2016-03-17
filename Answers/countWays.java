int countWays(int n, int k) {

  ArrayList<ArrayList<Integer>> c_nk = new ArrayList<>();
  for (int i = 0; i <= n; i++) {
    c_nk.add(new ArrayList<Integer>());
    for (int j = 0; j <= k; j++) {
      c_nk.get(i).add(0);
    }
  }
  c_nk.get(0).set(0, 1);
  for (int i = 0; i < n; i++) {
    ArrayList<Integer> cur = c_nk.get(i);
    ArrayList<Integer> next = c_nk.get(i + 1);
    for (int j = 0; j <= k; j++) {
      if (i + 1 <= n) {
        next.set(j, next.get(j) + cur.get(j));
        if (j + 1 <= k) {
          next.set(j + 1, next.get(j + 1) + cur.get(j));
        }
      }
    }
  }

  return  c_nk.get(n).get(k) ;
}
