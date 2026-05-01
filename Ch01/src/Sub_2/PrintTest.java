package Sub_2;
/*
 * 날짜: 2026-04-27
 * 이름: 이찬영
 * 내용: 다양한 출력 실습
 */
public class PrintTest {

	public static void main(String[] args) {
		
		//ptintln:라인 출력문
		System.out.println("Hello java!"); // println(Print Line): 문자열 출력 후 라인(개행) 이동
		System.out.println("Welcome java!");
		
		
		// print: 기본 출력문, 라인(줄바꿈,개행) 이동 없음
		System.out.print("Greeting Java!");
		System.out.print("Hey Java!");
		System.out.println("\n"); // \n: 이스케이프 문자, new line
		
		//printf: 포맷 출력문
		System.out.printf("number : %d\n", 27);// %d: decimal, 숫자 출력
		System.out.printf("My name is %s", "이찬영");   // %s: string, 문자열 출력
		
	}
	
}
