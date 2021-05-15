
public class CoffeMakerDemo {

	public static void main(String[] args) {
		
		CoffeeMachine machine = CoffeeMachine.makeMachine();
		System.out.println("Water Level is at " + machine.checkWater());
		machine.addWater();
		Boiler.BoilerDirector.boil();
		System.out.println(Boiler.BoilerDirector.getHeater());
		machine.brewCoffee();
		System.out.println("Coffee Level: " + CoffeeMachine.pot.checkPot());
		System.out.println("Pot is on plate " + CoffeePot.potStatus);
		
		BaseCoffee coffee = CoffeeMachine.pot.pourCoffee();
		System.out.println("Pot is on plate " + CoffeePot.potStatus);
		System.out.println("Coffee Level: " + CoffeeMachine.pot.checkPot());
		System.out.println("Coffee Strength " + CoffeeMachine.str.getStr());
		coffee.describe();
		System.out.println("Total cost " + coffee.cost() + "\n");
		machine.pot.returnPot();
		System.out.println("------------------------------");
		
		coffee = machine.pot.pourCoffee();
		coffee = new Sugar(coffee);
		System.out.println("Coffee Level: " + CoffeeMachine.pot.checkPot());
		CoffeeMachine.str.setStr("Strong");
		System.out.println("Coffee Strength " + CoffeeMachine.str.getStr());
		coffee.describe();
		System.out.println("Total cost " + coffee.cost() + "\n");
		System.out.println("------------------------------");
		
		coffee = machine.pot.pourCoffee();
		coffee = new Cream(coffee);
		System.out.println("Coffee Level: " + CoffeeMachine.pot.checkPot());
		CoffeeMachine.str.setStr("light");
		System.out.println("Coffee Strength " + CoffeeMachine.str.getStr());
		coffee.describe();
		System.out.println("Total cost " + coffee.cost() + "\n");
		System.out.println("------------------------------");
		
		coffee = machine.pot.pourCoffee();
		coffee = new Sugar(coffee);
		coffee = new Cream(coffee);
		System.out.println("Coffee Level: " + CoffeeMachine.pot.checkPot());
		CoffeeMachine.str.setStr("medium");
		System.out.println("Coffee Strength " + CoffeeMachine.str.getStr());
		coffee.describe();
		System.out.println("Total cost " + coffee.cost() + "\n");
		machine.pot.returnPot();
		System.out.println("------------------------------");
		
		System.out.println("Pot is on plate " + CoffeePot.potStatus);
	}

}
