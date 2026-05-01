package sub2;
/**
 * 날짜 : 2026-04-08
 * 이름 : 이찬영
 * 내용 : 자바 메서드 실습하기
 */
public class MathodTypeTest {

	//main 메서드 : 프로그램 시작 메서드
	public static void main(String[] args) {
		
		//type1 호출
		double y1 = type1(1.2);
		double y2 = type1(2.3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		
		
		//type2 메서드 호출
			type2(true);
			type2(false);
			type2(1 > 0);
			type2(1 < 0);
		
		//type3 메서드 호출
			
			boolean result = type3();
			System.out.println("result : " + result);
		
		//type4 메서드 호출
			type4();
		
	}//main end
	
	
	// 메서드 형태1 - 매개변수 O, 반환값 O
		public static double type1(double r) {
			
			double y = (r * r) * 3.14;
			
			return y;
		}
	// 메서드 형태2 - 매개변수 O, 반환값 O
		public static void type2(boolean status) {
			
			if(status) {
				System.out.println("참");
				
			}else {
				System.out.println("거짓");
			}
		}
		
		
	// 메서드 형태3 - 매개변수 X, 반환값 O
	
		public static boolean type3() {
			
			int num = 0;
			if(num > 0) {
				return true;
			}else {
				return false;
			}
			
		}
		
		
	// 메서드 형태4 - 매개변수 X, 반환값 X
		public static void type4() {
			double result = type1(2.5);
			System.out.println("반지름 길이 2.5 원의 넓이 : " + result);
		}
		
		
		
}
