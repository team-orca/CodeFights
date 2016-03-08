int[] dijkstraDistances(int[][] matrix, int startVertex) {

  boolean[] used = new boolean[matrix.length];
  int[] distance = new int[matrix.length];
  Arrays.fill(distance, Integer.MAX_VALUE);
  distance[0] = 0;

  for (int i = 0; i < matrix.length; i++) {
    int chosenIndex = -1;
    for (int j = 0; j < matrix.length; j++) {
      if (!used[j] && (chosenIndex == -1 ||
          distance[chosenIndex] > distance[j])) {
        chosenIndex = j;
      }
    }
    used[chosenIndex] = true;
    for (int j = 0; j < matrix.length; j++) {
      if (matrix[chosenIndex][j] != -1 &&
          distance[j] > distance[chosenIndex] + matrix[chosenIndex][j]) {
        distance[j] = distance[chosenIndex] + matrix[chosenIndex][j];
      }
    }
  }

  return distance;
}
