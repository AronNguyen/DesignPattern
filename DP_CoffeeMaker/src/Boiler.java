

public class Boiler {

	private static Boiler boiler;
	public static int waterlvl = 100;
	static Heater BoilerHeater;
	static HeatDirector BoilerDirector;
	
	public static Boiler makeBoiler() {
		if (boiler == null) {
			boiler = new Boiler();
			BoilerHeater = new BoilerHeater();
			BoilerHeater.buildHeater();
			BoilerDirector = new HeatDirector(BoilerHeater);
		}
		return boiler;
	}
	
	public int getWater() {
		return waterlvl;
	}
}
