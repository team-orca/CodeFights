int semiprimeByNumber(int n) {

  class Helper {
    ArrayList<Integer> generatePrimes(int n) {
      int current = 2;
      ArrayList<Integer> primes = new ArrayList<>();

      while (primes.size() < n) {
        boolean isPrime = true;
        for (int i = 2; i * i <= current; i++) {
          if (current % i == 0) {
            isPrime = false;
            break;
          }
        }
        if (isPrime) {
          primes.add(current);
        }
        current++;
      }
      return primes;
    }
  }
  Helper h = new Helper();

  ArrayList<Integer> semiprimes = new ArrayList<>();

  ArrayList<Integer> primes = h.generatePrimes(n);

  for (int i = 0; i < primes.size(); i++) {
    for (int j = i; j < primes.size(); j++) {
      semiprimes.add(primes.get(i) * primes.get(j));
    }
  }
  Collections.sort(semiprimes);

  return semiprimes.get(n - 1);
}
