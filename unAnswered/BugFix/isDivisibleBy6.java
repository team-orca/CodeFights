String[] isDivisibleBy6(String inputString) {

  int digitSum = 0;
  char leftBound = '0',
      rightBound = '9';
  ArrayList<String> answer = new ArrayList<>();
  char[] mask = inputString.toCharArray();
  int asteriskPos = -1;

  for (int i = 0; i < mask.length; i++) {
    if (leftBound <= mask[i] &&
        mask[i] <= rightBound) {
      digitSum += mask[i] - leftBound;
    }
    else {
      asteriskPos = i;
    }
  }

  for (int i = 0; i < 10; i++) {
    if ((digitSum + i) % 6 == 0) {
      mask[asteriskPos] = (char) (leftBound + i);
      if ((mask[mask.length - 1] - leftBound) % 2 == 0) {
        answer.add(String.valueOf(mask));
      }
    }
  }

  return answer.toArray(new String[0]);
}
