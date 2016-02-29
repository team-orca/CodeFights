String caesarBoxCipherEncoding(String inputString) {
		int length = inputString.length();
		String returningString="";
		int rows = (int)Math.sqrt (length);
		char [][] charArray = new char[rows][rows];
		int k=0;
		for(int i=0; i<rows; i++){
			for(int j=0; j<rows; j++){
				charArray[i][j] = inputString.charAt (k);
				k++;
			}
		}
		for(int i=0; i<rows; i++){
			for(int j=0; j<rows; j++){
			returningString += "" + (charArray[j][i]);
			}
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

