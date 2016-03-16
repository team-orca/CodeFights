int SubsetSum(int[] arr, int SUM) {
ArrayList<ArrayList<Integer>> set = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
       
        for(int i : arr)
        	list.add(i);
        int counter=0;
        
        set = powerSet(list);
        for (Iterator<ArrayList<Integer>> it = set.iterator(); it.hasNext(); ) {
           ArrayList<Integer> f = it.next();
          
           int sum=0;
           
           for (Iterator<Integer> it1 = f.iterator(); it1.hasNext(); ) {
        	 
               int k = it1.next();
               sum += k;
           
           }
           if(sum == SUM){
        	   counter++;
           }
        
           }     
     
	
   return counter;
}
public  ArrayList<ArrayList<Integer>> powerSet(ArrayList<Integer> originalSet) {
        ArrayList<ArrayList<Integer>> sets = new ArrayList<ArrayList<Integer>>();
        if (originalSet.isEmpty()) {
            sets.add(new ArrayList<Integer>());
            return sets;
        }
        List<Integer> list = new ArrayList<Integer>(originalSet);
        Integer head = list.get(0);
        ArrayList<Integer> rest = new ArrayList<Integer>(list.subList(1, list.size()));
        for (ArrayList<Integer> set : powerSet(rest)) {
            ArrayList<Integer> newSet = new ArrayList<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
