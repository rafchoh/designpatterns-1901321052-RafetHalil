package toys.design_patterns;

public interface Observable {
	
	void subscribe(Observer dwarves);
	void unsubscribe(Observer dwarves);
	
	void notifyObservers();
	String getUpdate();

}
