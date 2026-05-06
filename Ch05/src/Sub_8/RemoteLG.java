package Sub_8;

public class RemoteLG implements RemoteControl{

	@Override
	public void poweron() {
		
		System.out.println("LG - poweron");
	}

	@Override
	public void poweroff() {
		System.out.println("LG - poweroff");
	}

	@Override
	public void chup() {
		
		System.out.println("LG - chup");
	}

	@Override
	public void chdown() {
		System.out.println("LG - chdown");
		
	}

	@Override
	public void soundup() {
		System.out.println("LG - soundup");
		
	}

	@Override
	public void sounddown() {
		System.out.println("LG - sounddown");
		
	}

	
	
}
