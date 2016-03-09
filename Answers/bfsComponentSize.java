int bfsComponentSize(boolean[][] matrix) {

  ArrayList<Boolean> visited = new ArrayList<>();
  LinkedList<Integer> queue = new LinkedList<>();
  int componentSize = 0;

  for (int i = 0; i < matrix.length; i++) {
    visited.add(false);
  }

  visited.set(1, true);
  queue.add(1);

  while (queue.size() > 0) {
    int currentVertex = queue.pop();
    visited.set(currentVertex, true);
    componentSize++;
    for (int nextVertex = 0; nextVertex < matrix.length; nextVertex++) {
      if (matrix[currentVertex][nextVertex] && !visited.get(nextVertex)) {
        visited.set(nextVertex, true);
        queue.add(nextVertex);
      }
    }
  }

  return componentSize;
}
