boolean Armstrong_number(int N) {
        int t = N;
		int s = 0;
        int k =  String.valueOf(N).length();
		while(t != 0) {
			s += (int)Math.pow( t % 10,k);
			t /= 10;
		}
		
		if(s == N) 
			return true;
    return false;
}
