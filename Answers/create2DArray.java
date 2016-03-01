int[][] create2DArray(int[] lengths) {
int[][] sum= new int[lengths.length][];
    for(int i=0; i<lengths.length; i++){
        sum[i]=new int[lengths[i]];
        for(int k=0; k<lengths[i]; k++){
            sum[i][k]=k;
            
        }
    }    
    return sum;
}

