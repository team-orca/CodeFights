boolean isEarlier(int[] time1, int[] time2) {
  if ( time1[0] <  time2[0] ) {
    return true;
  }
     if ( time1[0] ==  time2[0]  ) {
          if ( time1[1] <  time2[1] )
            return true;
         else{
             return false;
         }
  }
  return false;
}
