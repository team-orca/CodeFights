String[] theTree(int Number) {
    String[] tree = new String[Number];
    for(int i=0; i<Number; i++){
        tree[i]="";
        
        for(int k=0; k<Number-i-1; k++){
            tree[i]=tree[i].concat(" ");
        }
        for(int j=0; j<2*i+1; j++){
        tree[i]=tree[i].concat("*");
        }
        
        for(int k=0; k<Number-i-1; k++){
            tree[i]=tree[i].concat(" ");
        }
    }
    return tree;
}
