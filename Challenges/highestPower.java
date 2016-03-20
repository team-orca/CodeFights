int c,x,y,k=2,r;
    int highestPower(int n, int a) {


        for(;a>1;k+=k<3?1:2){
            for(c=0;a%k<1;a/=k)c++;

            if(c>0) {
                x = k;
                y = c;
            }
        }

        for(;n>0;r += n)n /= x;

        return r/y;

    }
