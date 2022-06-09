package toys.design_patterns;

public class BikeFactory extends ToyFactory {

	@Override
	public ToyProduct createProduct(String productName) {
		if(productName == "Bikes") {
			return new BikeToy();
		}
		System.out.println("Unknown toy!");
		return null;
	}


}
