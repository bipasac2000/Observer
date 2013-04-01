import java.util.LinkedList;
import java.util.ListIterator;

public class Processor {
   
    private int count; 
    private LinkedList<Observer> observers = new LinkedList<Observer>();
  	private ListIterator<Observer> obIter;
  	private int state;
    
    Processor(){
    	count = 0; 
    }
    public int getCount() {return count;}
    public int getState() {return state;}
    public void attach(Observer ob) { observers.add(ob); }
    public void setState (int newNum) { state = newNum; notifyObservers(); }
  	
  	public void notifyObservers () {
  	  obIter = observers.listIterator(0);
  	  while(obIter.hasNext()) { ((Observer)obIter.next()).update(); }
  	}
    
    public void handle( int input ) {
    	count++; 
    	setState(input); 
    	}
  

 static public Processor setUpChain(int num) {
    Processor root = new Processor(); 
    new PrimeObserver(root); 
    new CountObserver(root); 
    new AllObserver(root); 
    return root;
 }
}

