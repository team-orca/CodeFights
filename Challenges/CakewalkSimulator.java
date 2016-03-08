int[][] CakewalkSimulator(int steps, String direction) {
    int x=0,y=0,step=steps;
    if(steps<0)
            step=-1*steps;
    if(direction.equals("downright")||(direction.equals("downleft"))){
        x=step; 
        y=step;}
    else if(direction.equals("right")){
        x=1;
        y=step; 
    }
    else if(direction.equals("down")){
        x=step;
        y=1;
    }
    int[][] map = new int[x][y];
    if(direction.equals("downright")){
        for(int i=0; i<step;i++){
            if(steps>0)
            map[i][i]=i+1;
            else
            map[i][i]=step-i;
        }
        }
    else if(direction.equals("downleft")){
        for(int i=0; i<step;i++){
            if(steps>0)
            map[step-i-1][i]=step-i;
            else
            map[i][step-i-1]=step-i;
        }
        }
    else if(direction.equals("right")){
        for(int i=0; i<step;i++){
            if(steps>0)
            map[0][i]=i+1;
            else
            map[0][i]=step-i;
        }
        }
    else if(direction.equals("down")){
        for(int i=0; i<step;i++){
            if(steps>0)
            map[i][0]=i+1;
            else
            map[i][0]=step-i;
        }
    }
    
        
    return map;
 
}
