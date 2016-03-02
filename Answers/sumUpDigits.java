int sumUpDigits(String str) {
    int sum=0;
    for(int i=0; i<str.length(); i++){
        if(Character.isDigit(str.charAt(i))){
            sum+=Character.getNumericValue(str.charAt(i));
        }
    }
    return sum;
}
