char[][] fractal(int n) {
  int size = (1 << n) - 1;
      
  class Helper {
    int[][] result;
    int[][] resultTmp;

    public Helper(int size) {
      result = new int[size][size];
      resultTmp = new int[size][size];
    }

    void draw(int n, int row, int column, int angle) {
      int size = (1 << n) - 1;
      if (angle != 0) {
        draw(n, row, column, 0);
        while (angle > 0) {
          angle--;
          for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
              int x = result[row + i][column + j];
              int i0 = j;
              int j0 = size - i - 1;
              resultTmp[row + i0][column + j0] = (x >> 1) | ((x & 1) << 3);
            }
          }
          for (int i = row; i < row + size; i++) {
            for (int j = column; j < column + size; j++) {
              result[i][j] = resultTmp[i][j];
            } 
          }
        }
        return;
      }
      if (n == 1) {
        result[row][column] = (1 << 3) - 1;
        return;
      }
      int add = size / 2 + 1;
      draw(n - 1, row, column, 0);
      if (n % 2 == 1) {
        draw(n - 1, row + add, column, 2);
        draw(n - 1, row, column + add, 3);
        draw(n - 1, row + add, column + add, 3);
        result[row][column + add - 1] |= (1 << 2);
        result[row + add - 1][column + add] |= (1 << 3);
        result[row + size - 1][column + add - 1] |= (1 << 0);
      } else {
        draw(n - 1, row + add, column, 1);
        draw(n - 1, row, column + add, 2);
        draw(n - 1, row + add, column + add, 1);
        result[row + add - 1][column] |= (1 << 3);
        result[row + add][column + add - 1] |= (1 << 2);
        result[row + add - 1][column + size - 1] |= (1 << 1);
      }
    }
  };

  Helper h = new Helper(size);
  h.draw(n, 0, 0, 0);
  int[][] result = h.result;
  char[][] answer = new char[size + 1][(size + 1) * 2 - 1];
  for (int i = 0; i < size; i++) {
    for (int j = 0; j < size; j++) {
      int cell = result[i][j];
      if ((cell >> 2) % 2 == 1) {
        answer[i][j * 2 + 1] = '_';
      }
      if ((cell >> 0) % 2 == 1) {
        answer[i + 1][j * 2 + 1] = '_';
      }
      if ((cell >> 3) % 2 == 1) {
        answer[i + 1][j * 2] = '|';
      }
      if ((cell >> 1) % 2 == 1) {
        answer[i + 1][j * 2 + 2] = '|';
      }
    }
  }

  for (int i = 0; i < size + 1; i++) {
    for (int j = 0; j < (size + 1) * 2 - 1; j++) {
      if (answer[i][j] == 0) {
        answer[i][j] = ' ';
      }
      if (answer[i][j] == ' ' && j > 0 && 
          answer[i][j - 1] == '_' && j + 1 < answer[i].length &&
          answer[i][j + 1] == '_') {
        answer[i][j] = '_';
      }
    }
  }
  return answer;
}
