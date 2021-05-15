
public class HeatDirector {

	private Heater heatbuilder = null;
	
	public HeatDirector(Heater heatBuilder) {
		this.heatbuilder = heatBuilder;
	}
	
	public void boil() {
		heatbuilder.heatUp();
	}

	public HeatContent getHeater() {
		return heatbuilder.getHeater();
		
	}
	
	
}
