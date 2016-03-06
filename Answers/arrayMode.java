int arrayMode(int[] sequence) {
  ArrayList<Integer> count = new ArrayList<>();
  int answer = 0;

  for (int i = 0; i < 10; i++) {
    count.add(0);
  }
  for (int i = 0; i < sequence.length; i++) {
    count.set(sequence[i] - 1, count.get(sequence[i] - 1) + 1);
    if (count.get(sequence[i] - 1) > count.get(answer)) {
      answer = sequence[i];
    }
  }
