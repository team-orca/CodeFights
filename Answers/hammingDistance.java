int hammingDistance(String string1, String string2) {
    int x=0;
    for(int i=0; i<Math.max(string1.length(), string2.length()); i++){
        if(string1.charAt(i)!=string2.charAt(i))
            x++;
    }
    return x;
}
