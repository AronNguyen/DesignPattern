

public class HeatContent {

	private boolean On_Off = false;
	private String heatType;
	
	public void setOn_Off() {
		
		On_Off = !On_Off;
	}
	
	public String getType() {
		return heatType;
	}
	
	public void setType(String type) {
		heatType = type;
	}
	
	public String toString() {
		
		if(On_Off) {
			On_Off = false;
			return heatType + " is Done Heating";
		}
		return heatType + " is Not On";
	}
	
}
