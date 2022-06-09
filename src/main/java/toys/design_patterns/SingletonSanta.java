package toys.design_patterns;

public class SingletonSanta {

	private static SingletonSanta santa;
	
	private SingletonSanta() {}

	public static SingletonSanta getInstance() {
		
		if(santa == null) {
			santa = new SingletonSanta();
		}
		
		return santa;
	}


	public void postMessage(String message) {
		System.out.println("Santa says: " + message);
	}
}
