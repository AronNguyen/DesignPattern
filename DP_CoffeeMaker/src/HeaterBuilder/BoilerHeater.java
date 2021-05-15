package HeaterBuilder;

public class BoilerHeater implements Heater{

	private HeatContent heat;
	
	public BoilerHeater() {
		heat = new HeatContent();
	}
	
	@Override
	public void heatUp() {
		heat.setOn_Off();
		System.out.println("Water is boiled");
	}

}
