int[] howManyLines(int[] X, int[] Y) {

  int[] result = new int[X.length - 1];
  Arrays.fill(result, 0);

  for (int i = 0; i < X.length; i++) {
    for (int j = i + 1; j < X.length; j++) {
      int A = Y[i] - Y[j],
          B =  X[j]-X[i] ,
          C = - A * X[i] - B * Y[i],
          countPoints = 0;
      for (int k = 0; k < X.length; k++) {
        if (A * X[k] + B * Y[k] + C == 0) {
          countPoints++;
        }
      }
      result[countPoints - 2]++;
    }
  }
  for (int i = 0; i < X.length - 1; i++) {
    result[i] /= (i + 1) * (i + 2) / 2;
  }
  return result;
}
