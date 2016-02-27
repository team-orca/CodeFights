int treeHeight(int[] parent) {

  class Helper {
    int dfs(int v, List<List<Integer>> graph) {
      int height = 0;
      for (int i = 0; i < graph.get(v).size(); i++) {
        int to = graph.get(v).get(i);
        height = Math.max(height, dfs(to, graph) + 1);
      }
      return height;
    }
  };

  Helper h = new Helper();

  List<List<Integer>> graph = new ArrayList<>();
  for (int i = 0; i < parent.length; i++) {
    graph.add(new ArrayList<Integer>());
  }

  for (int i = 1; i < parent.length; i++) {
    graph.get(parent[i]).add(i);
  }

  return h.dfs(0, graph);
}
