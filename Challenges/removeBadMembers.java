int[] removeBadMembers(int[] A) {
   
        List<Integer> l = new ArrayList<Integer>();
    for (int i = 0; i < A.length; i++)
    {
        l.add(A[i]);
    }
    while(l.get(0)==0)
        l.remove(0);
    
   
    while(l.get(l.size()-1)==0)
        l.remove(l.size()-1);
    
     int s = l.size();
    
    int [] x = new int [s];
    for(int i=0; i<s; i++)
        x[i]=l.get(i);
    
    return x;
}
