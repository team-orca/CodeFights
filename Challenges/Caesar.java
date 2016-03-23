String Caesar(String msg, int shift){
    String s = "";
    int len = msg.length();
    for(int x = 0; x < len; x++){
        char c = msg.charAt(x);
         if(!Character.isLetter(c)) 
         s+=msg.charAt(x);
        else{
        char z = (char)(msg.charAt(x) + shift);
       
        if (z > 'z' )
            s += (char)(msg.charAt(x) - (26-shift));
        else
            s += (char)(msg.charAt(x) + shift);
    }
    }
    return s.toUpperCase();
}
