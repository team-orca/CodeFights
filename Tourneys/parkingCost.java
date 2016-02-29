int parkingCost(String timeIn, String timeOut) {

    String[] time1, time2;
    time1=timeIn.split(":");
    time2=timeOut.split(":");
    int totalHour, totalMin;
    totalHour = Integer.parseInt(time2[0])-Integer.parseInt(time1[0]);
    int min = Integer.parseInt(time2[1])-Integer.parseInt(time1[1]);
    totalMin=60*totalHour+min;
    System.out.println(totalMin);
    int complex=0;
    if(totalMin<=30)
        return 0;
    else {
        totalMin-=30;
        if(totalMin>0&& totalMin<=90){
            if(totalMin%10==0)
                return totalMin/10;
            else if(totalMin%10!=0)
                return (totalMin+10)/10;
        }
        if(totalMin>90){
            complex=9;
            totalMin-=90;
            if(totalMin%10==0)
                return ((totalMin/10)*2+complex);
            else if(totalMin%10!=0)
                return (((totalMin+10)/10)*2+complex);
        }
            
    }
        
    
    return 1;
}
