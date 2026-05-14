package Sub_1;
/**
 *  날짜 : 2026-05-14
 *  이름 : 이찬영
 *  내용 : java 스레드 실습
 * 
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		ChildThread ct1 = new ChildThread();
		ChildThread ct2 = new ChildThread();
		
		ct1.setName("Child1");
		ct2.setName("Child2");
		
		//자식 스레드 실행
		ct1.start();
		ct2.start();
		
			for(int i = 0 ; i<10 ; i++) {
			
			System.out.println("Main 스레드 실행");
			try {
				Thread.sleep(1000);
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println("Main Thread 종료");
	}
	
}
