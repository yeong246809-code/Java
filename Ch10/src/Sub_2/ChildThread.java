package Sub_2;

import java.util.Iterator;

public class ChildThread extends Thread {

	@Override
	public void run() {
		for(int i = 0 ; i<10 ; i++) {
			
			System.out.println(getName() + " - 스레드 실행");
			try {
				Thread.sleep(1000);
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " - 스레드 실행");
	}
	
	
}
