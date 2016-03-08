int alphabeticShiftEncoding(String inputStr, String encodedStr) {

  int result = inputStr.length();
  for (int i = 0; i < inputStr.length(); i++) {
    int mistakes = 0,
        k = encodedStr.charAt(i) - inputStr.charAt(i);
    if (k < 0) {
      k += 26;
    }
    for (int j = 0; j < inputStr.length(); j++) {
      if ((inputStr.charAt(j) - 'a' + k) % 26 !=
           encodedStr.charAt(j) - 'a') {
        mistakes++;
      }
    }
    result =  ... ;
  }
  return result;
}
