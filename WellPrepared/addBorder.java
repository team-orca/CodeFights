String[] addBorder(String[] picture) {
    int l = picture.length;
    int row = l + 2;
    int sL = picture[0].length();
    int col = sL + 2;
    String s="";
    String [] r = new String[row];
    for(int i=0; i<row; i++){
        if(i == 0 || i==row-1){
        for(int j=0; j<col; j++){
            s+="*";
            if(j == col-1){
                if(i == 0){
                r[i] = s;
                s = "";
                }
                if(i == row-1){
                    r[i] = s;
                }
            }
        }
        }
        else{
        r[i] = "*" + picture[i-1] + "*";
        }
    }
    return r;
}
