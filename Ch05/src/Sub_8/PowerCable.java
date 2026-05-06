package Sub_8;

public class PowerCable implements Socket{
	
	private Bulb bulb;
	
	public PowerCable(Bulb bulb) {
		this.bulb = bulb;
		
	}
	
	@Override
	public void switchon() {
		bulb.lighton();
		
	}

	@Override
	public void switchoff() {
		bulb.lightoff();
		
	}

}
