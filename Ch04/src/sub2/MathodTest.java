package sub2;
/**
 * 날짜 : 2026-04-08
 * 이름 : 이찬영
 * 내용 : 자바 매서드 실습하기
 */
public class MathodTest {
	
	// main 메서드 : 프로그램 시작 메서드
	public static void main(String[] args) {
		
		//메서드 호출
		int y1 = fn(1); // fn 메서드의 매개변수 x의 인자값 1 전달
		int y2 = fn(2);
		int y3 = fn(3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		
		
	}//main end
	
	// 메서드 정의
	public static int fn(int x) {
		
		int y = 2 * x + 3;
		
		return y;
	}
	
	
	
}
