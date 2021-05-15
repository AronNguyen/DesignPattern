
public class Cream extends CoffeeExtras{

	public Cream(BaseCoffee Coffee) {
		super(Coffee);
	}
	
	@Override
	public void describe() {
		Coffee.describe();
		System.out.println("Cream has been added to your coffee");
	}

	@Override
	public double cost() {
		double tcost = Coffee.cost();
		double cost = 0.90;
		System.out.println(" Cream cost " + cost);
		return cost + tcost;
	}
}