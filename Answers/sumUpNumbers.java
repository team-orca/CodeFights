int sumUpNumbers(String str) {
    int sum=0;    
 Pattern p = Pattern.compile("[]+");
Matcher m = p.matcher(str);
while (m.find()) {
   System.out.println(m.group());
}
     return sum;
}
