
public class AllObserver implements Observer {
	Processor processor; 
	AllObserver(Processor p){
		processor = p;
		p.attach(this); 
	}
	ServerFace proxy = new AllServerProxy(); 
	public void update() {
		System.out.println("View of All Observer "+ proxy.handle(processor.getState(), 0)); 
	}
	
}
