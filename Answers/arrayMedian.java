double arrayMedian(int[] s) {
    double m=0.0;
    Arrays.sort(s);
    if(s.length%2 ==1){
        m=s[s.length/2];
    }
    else{
        m= (s[s.length/2] + s[(s.length/2) -1]);
        m/=2.0;
    }
    return m;
}
