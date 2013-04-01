

// Purpose.  Proxy design pattern
// 1. Create a "wrapper" for a remote, or expensive, or sensitive target
// 2. Encapsulate the complexity/overhead of the target in the wrapper
// 3. The client deals with the wrapper
// 4. The wrapper delegates to the target
// 5. To support plug-compatibility of wrapper and target, create an interface

// the server will have a proxy to talk to sockets
// it also implements the same interface as the proxy the client talks to


class ServerProxy implements ServerFace {
/* intercepts calls to the server and decides whether to contact 
	the server or just manage the call itself
*/
	

  ServerFace CNetSrv; // the target... this one remote
  ServerProxy(int id){ 
  		CNetSrv = new CNetServer(id); 
  }
  
  public String handle (int input, int id) {
  	
  	return CNetSrv.handle(input, id); 
    
  }	
}








