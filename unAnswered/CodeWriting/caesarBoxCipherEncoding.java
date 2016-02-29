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


Caesar Box is a simple transposition cipher used in the Roman Empire, in which characters of the given message are broken into multiple lines that form a square when stacked up and then read the square column by column.

Given a message, encode it.

Example

For inputString = "a message", the square will look as follows:

a m
ess
age

Thus, the encoded message will be aea sgmse.

    [input] string inputString
        A string of length n2 for some integer n.

    [output] string

