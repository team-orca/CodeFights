int SnailCoordinate(int N) {
boolean isTrue=true;
    int x=0,y=0;
    int counter=0;
    int inc_pos=1;
    int inc_neg=-2;
    for(int i=1; i<N; i++){
        if(isTrue && counter%4==0){
            x+=inc_pos;
            counter++;
            System.out.println("First : "+x + "," +y);
        }
        
        else if(isTrue && counter%4==1){
            y+=inc_pos;
            counter++;
            inc_pos+=2;
            isTrue=false;
            System.out.println("First : "+x + "," +y);
        }
        else if(!isTrue && counter%4==2){
            x+=inc_neg;
            counter++;
            System.out.println("First : "+x + "," +y);
        }
        else if(!isTrue && counter%4==3){
            y+=inc_neg;
            counter++;
            inc_neg-=2;
            isTrue=true;
            System.out.println("First : "+x + "," +y);
        }
        
    }
    return x+y;
}
