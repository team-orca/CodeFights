    int o,c;
    int SubsetSum(int[] a, int s) {

        if(s==0)
            c++;

        for(int i=o;i<a.length;)
            SubsetSum(a,s-a[(o=++i)-1]);

        return c;
    }
