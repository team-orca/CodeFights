int champernowneDigit(int n) {
    String str= "";
    for(int i=0; i<=n; i++){
        str+=""+i;
    }
    
    return Character.getNumericValue(str.charAt(n));
}
