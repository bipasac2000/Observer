
class AllServerProxy implements ServerFace {

  ServerFace CNetSrv; 
  AllServerProxy(){ 
  		CNetSrv = new CNetServer(0); 
  }
  
  public String handle (int input, int id) {
  	
  	return CNetSrv.handle(input, id); 
    
  }	
}








