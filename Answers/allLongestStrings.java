String[] allLongestStrings(String[] inputArray) {

  ArrayList<String> answer = new ArrayList<>(Arrays.asList(inputArray[0]));
  for (int i = 1; i < inputArray.length; i++) {
    if (inputArray[i].length() == answer.get(0).length()) {
      answer.add(inputArray[i]);
    }
    if (inputArray[i].length() > answer.get(0).length()) {
      answer = new ArrayList<>(Arrays.asList(inputArray[i]));
    }
  }
  return answer.toArray(new String[answer.size()]);
}
