int Zeros(int N) {
    int divisor=5,counter=0;
    while(N>=1){
        N=N/divisor;
        counter+=N;
    }
    return counter;
}
