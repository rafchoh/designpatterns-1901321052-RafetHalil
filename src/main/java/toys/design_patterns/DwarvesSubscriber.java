package toys.design_patterns;

public class DwarvesSubscriber implements Observer {
	
	private String name;
	private Observable speech;

	public DwarvesSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.speech == null) {
			System.out.println("No toys needed!");
			return;
		}
		String speech = this.speech.getUpdate();
		System.out.println(this.name + " says: " + speech + "!");
	}

	@Override
	public void setSpeech(Observable speech) {
		this.speech = speech;
	}

}
