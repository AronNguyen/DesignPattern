package CoffeeDecorator;
public class Cream extends CoffeeExtras{

	public Cream(BaseCoffee Coffee) {
		super(Coffee);
	}
	
	@Override
	public void describe() {
		Coffee.describe();
		System.out.println("Cream has been added to your coffee");
	}
}