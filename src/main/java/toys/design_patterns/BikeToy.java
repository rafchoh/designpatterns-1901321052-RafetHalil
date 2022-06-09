 package toys.design_patterns;

public class BikeToy extends ToyProduct {

	private boolean makeBikes;
	
	public void produceBikesStart() {
		System.out.println("Preparing for bike production!");
		this.makeBikes = true;
	}
	
	@Override
	public void prepare() {
		System.out.println("Crafting bikes ...");
	}
	
}
