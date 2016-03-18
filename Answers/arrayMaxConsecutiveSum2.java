int arrayMaxConsecutiveSum2(int[] inputArray) {

    int currentSum = 0,
        currentMinimalSum = 0,
        result = inputArray[0];

    for (int i = 0; i < inputArray.length; i++) {
        currentSum += inputArray[i];
        if (currentSum - currentMinimalSum > result) {
            result =  currentSum - currentMinimalSum;
        }
        if (currentSum < currentMinimalSum) {
            currentMinimalSum = currentSum;
        }
    }

    return result;
}
