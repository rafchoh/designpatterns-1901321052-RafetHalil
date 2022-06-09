package toys.design_patterns;

public class DollFactory extends ToyFactory {

	@Override
	public ToyProduct createProduct(String productName) {
		if(productName == "Dolls") {
			return new DollToy();
		}
		System.out.println("Unknown toy!");
		return null;
	}

}
