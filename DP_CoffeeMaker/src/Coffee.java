
public class Coffee implements BaseCoffee {

	@Override
	public void describe() {
		System.out.println("\nBlack Coffee");
	}

	@Override
	public double cost() {
		double cost = 1.10;
		System.out.println(" Coffee cost " + cost);
		return cost;
	}
	
	
	

}
