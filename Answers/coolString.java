boolean coolString(String inputString) {
// for inputString "2";
    if(Character.isDigit(inputString.charAt(0))){
            return false;}
    for(int i=0; i<inputString.length()-1; i++){
        if(Character.isDigit(inputString.charAt(i))){
            return false;}
        else if(Character.isWhitespace(inputString.charAt(i)))
           return false;
        else if((Character.isLowerCase(inputString.charAt(i))&&Character.isLowerCase(inputString.charAt(i+1))|| Character.isUpperCase(inputString.charAt(i))&& Character.isUpperCase(inputString.charAt(i+1)))&&i!=inputString.length()){
            return false;}
        
    }
           return true;
}
