int differentDigitsNumberSearch(int[] inputArray) {

  for (int i = 0; i < inputArray.length; i++) {
    int cur = inputArray[i];
    boolean[] was = new boolean[10];
    boolean ok = true;
    while (cur > 0) {
      if (was[cur % 10]) {
        ok = false;
        break;
      }
      was[cur % 10] = true;
      cur /= 10;
    }
    if (ok) {
      return  inputArray[i] ;
    }
  }

  return -1;
}
