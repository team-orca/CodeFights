boolean factorability(int a, int b, int c) {
    int delta = (b*b)-(4*a*c);
    if(delta<0)
    return false;
    if(Math.round(Math.sqrt(delta))==Math.sqrt(delta)){
    Object o = (-b + (int)Math.sqrt(delta))/(2*a);         
    if(o.getClass().getName().equals("java.lang.Integer"))
	return true	;
    }
    return false;
}
