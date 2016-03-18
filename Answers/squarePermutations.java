int squarePermutations(int n) {

  Map<String, Integer> lowest = new HashMap<>();
  Map<String, Integer> counts = new HashMap<>();

  for (int i = 1; ; i++) {
    char[] digits =  ... ;
    Arrays.sort(digits);
    String sortedDigits = String.valueOf(digits);

    int currentCount;
    if (counts.containsKey(sortedDigits)) {
      currentCount = counts.get(sortedDigits) + 1;
    } else {
      currentCount = 1;
      lowest.put(sortedDigits, i * i);
    }
    counts.put(sortedDigits, currentCount);

    if (String.valueOf(i * i).length() < String.valueOf((i + 1) * (i + 1)).length()) {
      int best = 0;
      for (String key : counts.keySet()) {
        if (counts.get(key) > n) {
          if (best == 0 || best > lowest.get(key)) {
            best = lowest.get(key);
          }
        }
      }
      if (best != 0) {
        return best;
      }

      lowest.clear();
      counts.clear();
    }
  }
}
