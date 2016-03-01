String replaceFirstDigitRegExp(String input) {
    String x=""; 
    char[] str = input.toCharArray();
    for(int i=0; i<input.length(); i++){ 
         
        if(Character.isDigit(str[i])) { 
            str[i]='#'; 
        break;} }  
    for(int i=0; i<input.length(); i++){ 
        x=x+""+str[i];   
    }    
    return x; }
