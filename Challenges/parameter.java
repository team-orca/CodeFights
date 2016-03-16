int parameter(int n) {
int sum=0;
int mult=1;
    while(n>0){
      mult*= n%10;
      sum+=n%10;
      n/=10;
    }
    int returning = lcm(sum, mult);
    return returning;
}
public int gcd(int a, int b)
{
    while (b > 0)
    {
        int temp = b;
        b = a % b; // % is remainder
        a = temp;
    }
    return a;
}
public int lcm(int a, int b)
{
    return a * (b / gcd(a, b));
}
