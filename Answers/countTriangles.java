int countTriangles(int[] X, int[] Y) {
  int size = X.length;
    int ans = 0;
    for (int i=0; i<size; i++)
        for (int j=i+1; j<size; j++)
        for (int k=j+1; k<size; k++) {
        int x1 = X[i] - X[j], y1 = Y[i] - Y[j];
        int x2 = X[i] - X[k], y2 = Y[i] - Y[k];
        if (x1*y2 != x2*y1)
            ans++;
    }
    return ans;
}
