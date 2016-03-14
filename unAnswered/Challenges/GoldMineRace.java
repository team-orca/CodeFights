int GoldMineRace(int[][] cities, double[] speed, int[] goldmine) {
    double [] ratio = new double [speed.length];
    boolean [] check = new boolean [speed.length];
    int Xgold=goldmine[0], Ygold=goldmine[1],returningCity=-1,counter=0;
    double highest=Double.MAX_VALUE;
    for(int i=0; i<cities.length; i++){
            int citX = cities[i][0];
             int citY = cities[i][1];
           ratio[i] = Math.sqrt(Math.pow(citX-Xgold, 2) +  Math.pow(citY-Ygold, 2))/ speed[i];
    }
   double remember=0.0;
   double remember2 = 0.0;
    for(int i=0; i<ratio.length; i++)  {  
        for(int j=0; j<ratio.length; j++) {
            if(ratio[i] == ratio[j] && i!=j){
               check[i] = true;
                break;
            }
        }
                 for(int j=0; j<check.length; j++) {
            if(check[j] == true){
                return -1;
            }
        }
    }
    
    for(int i=0; i<ratio.length; i++){
         
        if(highest> ratio[i] && ratio[i] != 0.0){
                highest=ratio[i];
                returningCity=i;
        }
    }
            
    
    return returningCity;
}
