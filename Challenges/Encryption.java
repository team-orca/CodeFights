String Encryption(String M, int k) {
    char [] e = M.toCharArray();
    for(int i=0; i<e.length; i++){
        if(e[i]<=90){
            e[i]+=k%26;
            if( e[i]>90)
                 e[i]-=26;
        }
            else{
            e[i]+=k%26;
                if( e[i]>'z')
                     e[i]-=26;
        }
       
    }
    
    return String.valueOf(e);
}
