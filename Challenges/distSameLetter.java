String distSameLetter(String s) {
    int dist=0;
    char x=' ';
    for(int i=0; i<s.length()-1; i++){
        for(int j=i+1; j<s.length(); j++){
            if(s.charAt(i) == s.charAt(j)){
                int temp= j-i;
            if(temp>dist){
                dist=temp;
                x=s.charAt(i);
            }
        }
        }
    }
    dist++;
    String ret = "" + x + dist;
    return ret;
}
