int telephoneGame(String[] messages) {

  int answer = -1;
  for (int i = 1; i < messages.length; i++) {
    if (!messages[i].equals(messages[i - 1])) {
      answer = i;
      break;
    }  
  }
  return answer;
}
