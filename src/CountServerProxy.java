

class CountServerProxy implements ServerFace {

  ServerFace CNetSrv;
  CountServerProxy(){ 
  		CNetSrv = new CNetServer(2); 
  }
  
  public String handle (int input, int count) {
  	
  	if (count%4 == 0)
  		return CNetSrv.handle(input, 2);
  	else 
  		return ""; 
  }	
}








