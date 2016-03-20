int[] closestNeighbor(int n, int a, int b, int c) {
    int [] x = new int[2];
    int smallest=0;
    int biggest=0;
    for(int i=n-1; i>0; i--){
        if(i%a == 0 && i%b == 0 && i%c == 0){
            biggest=i;
            break;
        }
     }
    for(int i=n+1; i<Integer.MAX_VALUE; i++){
        if(i%a == 0 && i%b == 0 && i%c == 0){
            smallest=i;
            break;
        }
    }
        x[0] = biggest;
        x[1] = smallest;
        return x;
}
