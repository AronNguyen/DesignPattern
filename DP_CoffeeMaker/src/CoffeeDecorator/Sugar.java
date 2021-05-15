package CoffeeDecorator;
public class Sugar extends CoffeeExtras{

	public Sugar(BaseCoffee Coffee) {
		super(Coffee);
	}
	
	@Override
	public void describe() {
		Coffee.describe();
		System.out.println("Sugar has been added to your coffee");
	}
}
