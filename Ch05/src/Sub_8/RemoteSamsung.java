package Sub_8;

public class RemoteSamsung implements RemoteControl {

	@Override
	public void poweron() {
		System.out.println("Samsung - poweron");
		
	}

	@Override
	public void poweroff() {
		System.out.println("Samsung - poweroff");
		
	}

	@Override
	public void chup() {
		System.out.println("Samsung - chup");
		
	}

	@Override
	public void chdown() {
		System.out.println("Samsung - chdown");
		
	}

	@Override
	public void soundup() {
		System.out.println("Samsung - soundup");
		
	}

	@Override
	public void sounddown() {
		System.out.println("Samsung - sounddown");
		
	}

}
