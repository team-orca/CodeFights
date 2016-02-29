int crossingSum(int[][] matrix, int a, int b) {
int sum=0;
    for(int i=0; i<matrix[0].length; i++){
        sum+=matrix[a][i];
    }
    for(int j=0; j<matrix.length; j++){
        sum+=matrix[j][b];
    }
    sum-=matrix[a][b];
    return sum;
}

