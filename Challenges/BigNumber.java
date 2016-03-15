String BigNumber(String S1, String S2, String O) {
    BigDecimal v1 = new BigDecimal(S1);
    BigDecimal v2 = new BigDecimal(S2);
   
    
   v1 = ( O.charAt(0) == '+') ? v1.add(v2) : v1.subtract(v2);
    String f= R(v1);
    return f;
}
String R(BigDecimal v1){
        DecimalFormat d = new DecimalFormat("0.###################################");
        String f = d.format(v1.stripTrailingZeros());
        return f;
}
