boolean evenDigitsOnly(int n) {
    boolean isEven=true;
    while(n>0){
        if((n%10)%2!=0){
            isEven=false;
            break;}
        else 
            n=n/10;
        
    }
    return isEven;
}
