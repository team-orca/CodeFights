String reflectString(String inputString) {
    String rtn="";
    for(int i=0; i<inputString.length(); i++){
        rtn+=""+Character.toString((char)(219-inputString.charAt(i)));
        
    }
      return rtn;
}
