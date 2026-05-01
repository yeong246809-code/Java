package sub3;
/**
 * 날짜 : 2026-04-08
 * 이름 : 이찬영
 * 내용 : 자바 메서드 실습하기
 */
public class MathodOverloadTest {
	
	public static void main(String[] args) {
		int result1 = add(1);
		int result2 = add(1, 2);
		double result3 = add(1.2, 2.3);
		String result4 = add("Hello", "Busan");
		
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
	}
	
	
	// 오버로드 메서드 정의 : 메서드 이름이 같지만 매개변수로 구분하는 메서드
	public static int add(int a) {// 1번 메서드
		return a + a;
	}
	public static int add(int a, int b) {// 2
		return a + b;
	}
	public static double add(double a, double b) { // 3
		return a + b;
	}
	public static String add(String a, String b) { // 4
		return a + b; 
	}
}
