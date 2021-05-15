
public class CoffeePot {

	private static CoffeePot pot;
	public static int waterlvl = 0;
	public static boolean potStatus = true;
	static Heater PlateHeater;
	static HeatDirector PlateDirector;
	
	public static CoffeePot makeCoffeePot() {
		if (pot == null) {
			pot = new CoffeePot();
			PlateHeater = new PlateHeater();
			PlateDirector = new HeatDirector(PlateHeater);
		}
		return pot;
	}
	
	public BaseCoffee pourCoffee() {
		if(waterlvl < 25) {
			System.out.println("Not enough coffee in the pot");
			return null;
		}
		
		potStatus = false;
		waterlvl -= 25;
		System.out.println("\nCoffee is poured");
		return new Coffee();
	}
	
	public int checkPot() {
		return waterlvl;
	}
	
	public void returnPot() {
		potStatus = true;
	}
	
}
