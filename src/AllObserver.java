
public class AllObserver implements Observer {
	Processor processor; 
	AllObserver(Processor p){
		processor = p;
		p.attach(this); 
	}
	ServerFace proxy = new ServerProxy(0); 
	public void update() {
		//System.out.println(processor.getState()); 
		System.out.println("Handled by All Server "+ proxy.handle(processor.getState(), 0)); 
	}
	
}
