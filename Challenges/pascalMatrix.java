int[][] pascalMatrix(int n) {
int[][] matrix = new int[n-n/2][n];
    for(int i=0; i<n-n/2; i++){
        for(int j=0; j<(n); j++){
           if(j==(n+2*i)/2)
               matrix[i][j]+=1;
            else if(j==(n-2*i)/2)
                matrix[i][j]+=1;
            else matrix[i][j]=0;
               
                
            if(i>1&&j>1 && i<n-n/2 && j<n-1)
                matrix[i][j]=matrix[i-1][j-1]+matrix[i-1][j+1];
        }
    }
    return matrix;
}
