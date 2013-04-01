
public class PrimeObserver implements Observer {
	Processor processor; 
	PrimeObserver(Processor p){
		processor = p;
		p.attach(this); 
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
	ServerFace proxy = new ServerProxy(1); 
	public void update() {
		int state = processor.getState(); 
		if (Prime.isPrime(state))
			//System.out.println(state); 
			System.out.println("Handled by Prime Server "+proxy.handle(state, 1)); 
		
	}
	
}
