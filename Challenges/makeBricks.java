boolean makeBricks(int small, int big, int goal) {
    for(int i=0; i<=small; i++)
        if((goal-i) %5 == 0 && 5*big + small >=goal )
            return true;
    
    return false;

}
