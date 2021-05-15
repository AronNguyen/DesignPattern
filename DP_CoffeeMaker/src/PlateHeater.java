

public class PlateHeater implements Heater{
	
	private HeatContent heat;
	
	@Override
	public void heatUp() {
		heat.setOn_Off();
	}

	@Override
	public void buildHeater() {
		heat.setType("Plate");
		
	}

	@Override
	public HeatContent getHeater() {
		return heat;
	}

}
