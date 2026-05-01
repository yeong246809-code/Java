package sub2;
/**
 *  날짜 : 2026-04-07
 *  이름 : 이찬영
 *  내용 : 변수 자료형 실습하기
 */

public class DataTypeTest {

	public static void main(String[] args) {
		
		// 정수형
		byte num1 = 127; 									// 1byte
		short num2 = 32767;									// 2byte
		int num3 = 2147483647;								// 4byte
		long num4 = 922337203685477507L; //L(long)타입		// 8byte
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		// 실수형
		float var1 = 0.123456789f;							// 4byte, 소수점  8자리까지 출력
		double var2 = 0.1234567890123456789;				// 8byte, 소수점 17자리까지 출력
		
		System.out.println("var1 : " + var1 );
		System.out.println("var2 : " + var2 );
		
		// 논리형
		boolean b1 = true;									// 1byte, 참
		boolean b2 = false;									// 1byte, 거짓
		
		System.out.println("b1 : " + b1 );
		System.out.println("b2 : " + b2 );
		
		// 문자형
		char c1 = 'A';										//2byte, 작은따옴표 문자 하나
		char c2 = '가';										//2byte, 작은따옴표 문자 하나
		
		System.out.println("c1 : " + c1 );
		System.out.println("c2 : " + c2 );
		
		// 문자열(참조형), 4byte 큰따옴표 문자 하나 이상
		String s1 = "A";
		String s2 = "가";
		String s3 = "Apple";
		String s4 = "가을";
		
		System.out.println("s1 : " + s1 );
		System.out.println("s2 : " + s2 );
		System.out.println("s3 : " + s3 );
		System.out.println("s4 : " + s4 );
	}
	
}
