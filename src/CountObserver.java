
public class CountObserver implements Observer {
	Processor processor; 
	CountObserver(Processor p){
		processor = p;
		p.attach(this); 
	}
	ServerFace proxy = new CountServerProxy(); 
	public void update() {
		int count = processor.getCount();
		String output = proxy.handle(processor.getState(), count); 
		if (!output.equals(""))
			System.out.println("View of Count Server "+output); 
	}
	
}
