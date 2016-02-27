int[][] matrixSum(int[][] matrix1, int[][] matrix2) {
    
    int[][] sum = new int[matrix1.length][matrix1[0].length];
    for(int i=0; i<matrix1.length; i++){
        for (int j=0; j<matrix1[0].length ; j++){
              sum[i][j]+=matrix1[i][j]+matrix2[i][j];
        }
    }
    return sum;
}
