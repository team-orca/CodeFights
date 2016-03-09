int firstOperationCharacter(String expr) {

  int balance = 0,
      maxAdditionPriority = -1,
      maxMultiplicationPriority = -1,
      additionIndex = -1,
      multiplicationIndex = -1;

  for (int i = 0; i < expr.length(); i++) {
    if (expr.charAt(i) == '(') {
      balance++;
    }
    if (expr.charAt(i) == ')') {
      balance--;
    }
    if (expr.charAt(i) == '+') {
      if (balance > maxAdditionPriority) {
        maxAdditionPriority = balance;
        additionIndex = i;
      }
    }
    if (expr.charAt(i) == '*') {
      if (balance > maxMultiplicationPriority) {
        maxMultiplicationPriority = balance;
        multiplicationIndex = i;
      }
    }
  }

  if (maxAdditionPriority > maxMultiplicationPriority) {
    return additionIndex;
  }
  else {
    return multiplicationIndex;
  }
}
