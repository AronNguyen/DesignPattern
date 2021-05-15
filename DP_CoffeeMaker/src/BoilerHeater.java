

public class BoilerHeater implements Heater{

	private HeatContent heat;
	
	public BoilerHeater() {
		heat = new HeatContent();
	}
	
	@Override
	public void heatUp() {
		heat.setOn_Off();
	}
	
	@Override
	public void buildHeater() {
		heat.setType("Boiler");
	}

	@Override
	public HeatContent getHeater() {
		return heat;
	}
	
	

}
