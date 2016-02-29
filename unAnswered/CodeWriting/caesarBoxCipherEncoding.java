String caesarBoxCipherEncoding(String inputString) {
}
//Solution ( created on mobilephone check syntax before use it)
String caesarBoxCipherEncoding(String inputString) {
int length = inputString.length;
String returningString="";
int rows = (int)Math.sqrt (length);
for (int i=0; i <length; i++){
returningString += "" + inputString.charAt (i);
if (i%rows==0 && i!=0)
returningString +="\n";
}
return returningString;
}
