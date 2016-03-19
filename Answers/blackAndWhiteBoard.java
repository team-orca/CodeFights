ArrayList<int[]> blackAndWhiteBoard(int h, int w, String[] queries) {

  int[] dx = {0, -1, 0, 1};
  int[] dy = {1, 0, -1, 0};
  String directions = ">^<v";

  int[][][][] next = new int[h][w][4][];
  for (int i = 0; i < h; i++) {
    for (int j = 0; j < w; j++) {
      for (int k = 0; k < 4; k++) {
        int i2 = i + dx[k];
        int j2 = j + dy[k];
        if (i2 < 0 || j2 < 0 || i2 >= h || j2 >= w) {
          i2 = -1;
          j2 = -1;
        }
        next[i][j][k] = new int[] {i2, j2};
      }
    }
  }

  ArrayList<int[]> ans = new ArrayList();
  for (int i = 0; i < queries.length; i++) {
    String[] q = queries[i].split("\\s+");
    int a = Integer.parseInt(q[1]);
    int b = Integer.parseInt(q[2]);
    if (q[0].equals("x")) {
      for (int k = 0; k < 4; k++) {
        int[] prev = next[a][b][(k + 2) % 4];
        if (prev[0] == -1) {
          continue;
        }
        next[prev[0]][prev[1]][k] =  next[a][b][k] ;
      }
    } else {
      int k = directions.indexOf(q[0]);
      ans.add(next[a][b][k]);
    }
  }

  return ans;
}
