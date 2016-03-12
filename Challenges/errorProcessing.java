int[] errorProcessing(int N, int[][] signals) {
    if(N==1){
        return signals[0];
    }
   int [] returningArray = new int [signals[0].length];
    for(int i=0; i<signals[0].length; i++){
         int counterZero=0, counterOne=0;
        for(int j=0; j<N; j++){
            if(signals[j][i] == 0){
                counterZero++;
            }
              if(signals[j][i] == 1){
                counterOne++;
            }            
        }
        if(counterZero > counterOne){
            returningArray[i] = 0;
        }
        else{
            returningArray[i] = 1;
        }
    }
    return returningArray;
}
