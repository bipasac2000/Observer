
public class CountObserver implements Observer {
	Processor processor; 
	CountObserver(Processor p){
		processor = p;
		p.attach(this); 
	}
	ServerFace proxy = new ServerProxy(2); 
	public void update() {
		int count = processor.getCount(); 
		if (count%4 == 0)
			//System.out.println(processor.getState()); 
			System.out.println("Handled by Count 4 Server "+proxy.handle(processor.getState(), 2)); 
	}
	
}
