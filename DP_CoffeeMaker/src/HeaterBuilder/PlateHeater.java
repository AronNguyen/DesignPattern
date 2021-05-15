package HeaterBuilder;

public class PlateHeater implements Heater{
	
	private HeatContent heat;
	
	@Override
	public void heatUp() {
		heat.setOn_Off();
		System.out.println("Coffee is warmed up");
	}

}
