boolean EasyNum(int n) {
int a,b,c=0;
    c=n%10;
    n=n/10;
    b=n%10;
    n=n/10;
    a=n%10;
    double square= (double)Math.pow(a,b);
    square/=c;
    if(square%a==0)
        return true;
    return false;
}
