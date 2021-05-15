
public class CoffeeMachine {
	
	private static CoffeeMachine machine;
	static SprayControl str;
	static Boiler boiler;
	static CoffeePot pot;
	
	public static CoffeeMachine makeMachine() {
		if(machine == null) {
			machine = new CoffeeMachine();
			boiler = Boiler.makeBoiler();
			pot = CoffeePot.makeCoffeePot();
			str = new SprayControl();
		}
		return machine;
	}
	
	public int checkWater() {
		return boiler.getWater();
	}
	
	public void addWater() {
		if(boiler.getWater() == 100) {
			System.out.println("Water in Boiler is Full");
		}
		else {
			Boiler.waterlvl = 100;
			System.out.println("Added " + (100 - boiler.getWater()));
		}
	}
	
	public void brewCoffee() {
		if(CoffeePot.potStatus && Boiler.waterlvl > 0) {
			Boiler.waterlvl -=25;
			CoffeePot.waterlvl = 100;
			System.out.println("Coffee is Brewed");
		}else if(!CoffeePot.potStatus) {
			System.out.println("Coffee Pot is off the Plate");
		}else {
			System.out.println("Boiler is out of water");
		}
	}
	
	public void setStr(String str) {
		CoffeeMachine.str.setStr(str);
	}
	
	
	
	
}
