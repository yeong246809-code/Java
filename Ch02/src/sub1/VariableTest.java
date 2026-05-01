package sub1;
/**
 * 날짜 : 2026-04-06
 * 이름 : 이찬영
 * 내용 : 자바 변수 실습
 */


public class VariableTest {

	public static void main(String[] args) {
		
		// 변수 선언
		int a = 7;
		int b = 9;
		
		System.out.println("a 값 : " + a);
		System.out.println("b 값 : " + b);
		
		// 변수값 변경
		a = 4;
		b = 5;
		
		System.out.println("a 값 : " + a);
		System.out.println("b 값 : " + b);
		
		// 상수 : 최초 저장된(초기화된) 값을 변경할수 없는 변수
		final int NUM = 5;
		
		// 최초 저장된 값은 고정값으로 변경불가
		//NUM = 7;
		System.out.println("NUM 상수값 : " + NUM);
		
	}
	
}
