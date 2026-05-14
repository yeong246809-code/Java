package Sub_2;
/**
 * 날짜 : 2026-05-14
 * 이름 : 이찬영
 * 내용 : java 스레드 join실습
 * 
 */
public class ThreadjoinTest {

	public static void main(String[] args) {
		
		ChildThread ct = new ChildThread();
		ct.setName("Child");
		
		ct.start();
		
		try {
			//자식 스레드가 작업을 마치고 main 스레드로 합류할때 까지 main 스레드 대기
			ct.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 스레드 종료");
		
	}
	
}
