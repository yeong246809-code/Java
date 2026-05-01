package sub2;
/**
 * 날짜 : 2026-04-06
 * 이름 : 이찬영
 * 내용 : 자바 출력문 실습
 */
public class PrintTest {

	public static void main(String[] args) {
		
		// 기본 출력
		System.out.println("Hello Java!");
		System.out.println("Hello Korea!");
		System.out.println("Hello Busan!");
		
		// 한줄 출력 : ln(Line, 줄바꿈(개행)) 없이 한줄로 그다음 출력문이 이어서 출력
		System.out.print("Welcome Java!");
		System.out.print("Welcome Korea!");
		System.out.print("Welcome Busan!");
		
		// 개행 처리
		System.out.println(); // println() 매서드로 개행처리(줄바꿈)
		System.out.print("Greeting");// 이스케이프 문자 로 줄바꿈(개행, new line)
		System.out.print("World!");
		
	}
	
}
