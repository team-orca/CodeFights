//Error on input "..."

int timedReading(int maxLength, String text) {
    int counter=0;
    String[] words = text.replaceAll("[^a-zA-Z ]", "").split("\\s+");
   
    for(int i=0; i<words.length; i++ ){
        
        if(words[i].length()<=maxLength){
            counter++;
        System.out.println(words[i]);}
    
    
}
    return counter;
}
