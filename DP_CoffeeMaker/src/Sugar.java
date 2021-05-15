
public class Sugar extends CoffeeExtras{

	public Sugar(BaseCoffee Coffee) {
		super(Coffee);
	}
	
	@Override
	public void describe() {
		Coffee.describe();
		System.out.println("Sugar has been added to your coffee");
	}

	@Override
	public double cost() {
		double tcost = Coffee.cost();
		double cost = 1.25;
		System.out.println(" Sugar cost " + cost);
		return cost + tcost;
	}
}
