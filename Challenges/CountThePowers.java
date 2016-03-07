int[][] CountThePowers(int maxRoot, int N) {
int[][] result = new int [maxRoot-1][2];
    for(int i=0;i<maxRoot-1; i++){
            int k=0;
            while (Math.pow(k+2,i+2)<=N){
            result[i][0]=i+2;
            result[i][1]=k+2;
                k++;
        }
        }
    return result;
    
}
