String knapsackLight2(int weight1, int weight2, int maxW) {
    if(weight1+weight2 <= maxW){
        return "both";}
    else if(weight1+weight2>maxW){
        if(weight1>maxW && weight2> maxW)
            return "none";
        else if(weight1>maxW && weight2<= maxW)
            return "second";
        else if(weight1<=maxW && weight2> maxW)
            return "first";}
        
        return "either";
}
