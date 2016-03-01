int[] borderSums(int[][] matrix) {

  int[] result = new int[matrix.length / 2];
  Arrays.fill(result, 0);

  for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix.length; j++) {
      int border = Math.min(i, j);
      border = Math.min(border, matrix.length - i - 1);
      border = Math.min(border, matrix.length - j - 1);
      result[border] +=  ... ;
    }
  }

  return result;
}
