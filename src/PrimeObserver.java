
public class PrimeObserver implements Observer {
	Processor processor; 
	PrimeObserver(Processor p){
		processor = p;
		p.attach(this); 
	}
	
	ServerFace proxy = new PrimeServerProxy(); 
	public void update() {
		int state = processor.getState(); 
		String output = proxy.handle(state, 1); 
		if (!output.equals(""))
			System.out.println("View of Prime Obserever "+output); 
	}
	
}
