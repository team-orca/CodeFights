int[] primeFactors(int n) {
    ArrayList<Integer> primefactors = new ArrayList<>();
for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                primefactors.add(i); 
                n /= i;
                i--;
            }
        }
    int[] primes = new int[primefactors.size()];
    for(int i=0; i<primefactors.size(); i++){
        primes[i]=primefactors.get(i);
    }
        return primes;
    }

