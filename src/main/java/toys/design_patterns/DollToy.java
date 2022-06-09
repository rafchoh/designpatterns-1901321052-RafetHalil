package toys.design_patterns;

public class DollToy extends ToyProduct {

	private boolean makeDolls;
	
	public void produceDollsStart() {
		System.out.println("Preparing for doll production!");
		this.makeDolls = true;
	}
	
	@Override
	public void prepare() {
		System.out.println("Crafting dolls ...");
	}

}