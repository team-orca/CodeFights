int sequencePeakElement(int[] sequence) {
  int left = 1;
  int right = sequence.length - 2;
  while (left < right) {
    int middle = (left + right) / 2;
    if (sequence[middle] > Math.max(sequence[middle - 1], sequence[middle + 1])) {
      left = right = middle;
      break;
    }
    if (sequence[middle - 1] < sequence[middle]) {
      left = middle + 1;
    } else {
      right = middle - 1;
    }
  }
    return  sequence[left] ;
}
