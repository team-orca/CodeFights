String BigNumber(String S, String A, String O) {
    BigDecimal V = new BigDecimal(S);
    BigDecimal v = new BigDecimal(A);
  
    
   V = ( O.charAt(0) == '+') ? V.add(v) : V.subtract(v);
   DecimalFormat d = new DecimalFormat("0.###################################");
   String f = d.format(V.stripTrailingZeros());
   return f;
}
