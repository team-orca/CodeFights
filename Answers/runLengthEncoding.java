String runLengthEncoding(String inputString) {

  int repeatLength = 1;
  StringBuilder answer = new StringBuilder();
  for (int i = 1; i < inputString.length(); i++) {
    if (inputString.charAt(i) != inputString.charAt(i - 1)) {
      answer.append(repeatLength);
      answer.append(inputString.charAt(i - 1));
      repeatLength = 1;
    }
    else {
      repeatLength++;
    }
  }
  answer.append(repeatLength);
  answer.append(inputString.charAt(inputString.length() - 1));
  return answer.toString();
}
