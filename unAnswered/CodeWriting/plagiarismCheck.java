boolean plagiarismCheck(String[] code1, String[] code2) {
       String x="", y="", z="", t="";
    boolean a = false;
    String kod=code2[0];
    if(kod.charAt(kod.indexOf("(")+1)==')')
        return false;
    if(!Character.isDigit(kod.charAt(kod.indexOf("(")+1))){
    x=kod.substring(kod.indexOf("(")+1,kod.indexOf(","));
    y=kod.substring(kod.indexOf(",")+2,kod.indexOf(")"));}
    String kod1=code1[0];
    if(!Character.isDigit(kod.charAt(kod.indexOf("(")+1))){
    z=kod1.substring(kod1.indexOf("(")+1,kod1.indexOf(","));
    t=kod1.substring(kod1.indexOf(",")+2,kod1.indexOf(")"));
    System.out.println(x);
    System.out.println(y);}
    
    for(int k=0; k<code1.length; k++){
    code1[k].replaceAll(z, x);
    code1[k].replaceAll(t,y);
    System.out.println(code1[k]);
        if(code1[k].equals(code2[k])){
        a=true;
           
    }
         else 
             a=false;
   
        
}
    return a;
   
 
   }     
    
    code1: ["def is_even_sum(a, b):", 
 "    return (a + b) % 2 == 0"] code2: ["def is_even_sum(summand_1, summand_2):", 
 "    return (summand_1 + summand_2) % 2 == 0"]
 
 code1: ["function return_four() {", 
 "  return 3 + 1;", 
 "}"] code2: ["function return_four() {", 
 "  return 1 + 3;", 
 "}"]
