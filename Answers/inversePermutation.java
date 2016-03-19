int[] inversePermutation(int[] p) {
    int[] x = new int[p.length];
    
    for (int i=0; i<p.length; i++)
        x[p[i]-1] = i+1;
    
    return x;
}
