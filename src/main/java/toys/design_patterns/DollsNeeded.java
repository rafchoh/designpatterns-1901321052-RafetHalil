package toys.design_patterns;

public class DollsNeeded implements Command {
	private DollToy toyD;
	
	public DollsNeeded(DollToy toyD) {
		this.toyD = toyD;
	}

	public void execute() {
		this.toyD.produceDollsStart();
	}
}
