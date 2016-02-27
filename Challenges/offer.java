int offer(int n, int[] p) {
    Arrays.sort(p);
    int s =0, k=1;
    while(k<=n){
       if(k%3!=0)
           s+=p[n-k];
        k++;
    }
    return s;
}
