String reduceString(String inputString) {

  int left = 0;
  while (left * 2 < inputString.length()) {
    int right = inputString.length() - left - 1;
    if (inputString.charAt(left) != inputString.charAt(right)) {
      break;
    } else {
      left++;
    }
  }
  if (left * 2 >= inputString.length()) {
    return  "" ;
  }
  return inputString.substring(left, inputString.length() - left);
}
