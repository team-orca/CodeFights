//This program is different solution of EasyNum Question
boolean EasyNum(int n) {
 String s =String.valueOf(n);
 int a= Character.getNumericValue(s.charAt(0));
 int b = Character.getNumericValue(s.charAt(1));
 int c = Character.getNumericValue(s.charAt(2));
 n = (int)Math.pow(a,b);
    if(n%c != 0 )
        return false;
    else{
       n= (n/c)%a;
   if(n==0)
       return true;
    return false;
    }
}
