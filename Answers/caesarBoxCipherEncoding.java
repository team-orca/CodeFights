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
