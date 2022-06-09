package toys.design_patterns;

import java.util.ArrayList;
import java.util.List;

public class Dwarves implements Observable {
	
	private List<Observer> dwarves;
	private String speech;
	
	public Dwarves() {
		this.dwarves = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer dwarves) {
		this.dwarves.add(dwarves);
		dwarves.setSpeech(this);
	}

	@Override
	public void unsubscribe(Observer dwarves) {
		this.dwarves.remove(dwarves);
		dwarves.setSpeech(null);
	}
	
	@Override
	public void notifyObservers() {
		for(Observer dwarves: this.dwarves) {
			dwarves.update();
		}
	}
	

	@Override
	public String getUpdate() {
		return this.speech;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
		this.notifyObservers();
	}
	
}
