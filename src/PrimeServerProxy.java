class PrimeServerProxy implements ServerFace {

  ServerFace CNetSrv; 
  PrimeServerProxy(){ 
  		CNetSrv = new CNetServer(1); 
  }
  
  static class Prime {
		static boolean isPrime(int n) {
			if (n==1) return false; 
			if (n==2) return true; 
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	}
  
  public String handle (int input, int id) {
  	
  	if (Prime.isPrime(input))
  		return CNetSrv.handle(input, id);
  	return ""; 
    
  }	
}








