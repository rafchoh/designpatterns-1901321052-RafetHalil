package toys.design_patterns;

public class BikesNeeded implements Command {
	private BikeToy toyB;
	
	public BikesNeeded(BikeToy toyB) {
		this.toyB = toyB;
	}

	public void execute() {
		this.toyB.produceBikesStart();
	}

}
