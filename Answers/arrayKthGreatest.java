int arrayKthGreatest(int[] inputArray, int k) {

  for (int i = 0; i < k; i++) {
    int indexOfMaximum = i,
        tmp = inputArray[i];

    for (int j = i + 1; j < inputArray.length; j++) {
      if (inputArray[j] > inputArray[indexOfMaximum]) {
        indexOfMaximum = j;
      }
    }

    inputArray[i] = inputArray[indexOfMaximum];
    inputArray[indexOfMaximum] = tmp; 
  }

  return inputArray[k - 1];
}
