ArrayList<Integer> fibonacciSum(int n) {

  ArrayList<Integer> fib = new ArrayList<>();
  int fib0 = 1;
  int fib1 = 1;
  fib.add(fib1);
  while (fib1 < n) {
    int fib2 = fib0 + fib1;
    fib.add(fib2);
    fib0 = fib1;
    fib1 = fib2;
  }

  ArrayList<Integer> ans = new ArrayList<>();
  for (int i = fib.size()-1; i >=0 ; i--) {
    if (n >= fib.get(i)) {
      n -= fib.get(i);
      ans.add(fib.get(i));
    }
  }

  Collections.reverse(ans);
  return ans;
}
