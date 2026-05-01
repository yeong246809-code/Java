package sub3;
/**
 * 날짜 : 2026-04-07
 * 이름 : 이찬영
 * 내용 : 자바 연산자 실습하기
 */
public class OperatorTest {
	
	public static void main(String[] args) {
	
		// 산술 연산자
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num2 * num3;
		int result4 = num4 / num2;
		int result5 = num4 % num3; // 나머지 연산자
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		
		// 증감 연산자
		int num = 0;
		
		num++; // 1 증가
		++num; // 1 증가
		
		System.out.println("num : " + num);
		
		num--; // 1 감소
		--num; // 1 감소
		
		System.out.println("num : " + num);
		
		// 복합대입 연산자
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		n1 += 1; // n1 = n1 + 1
		n2 -= 2; // n2 = n2 - 2
		n3 *= 3; // n3 = n3 * 3
		n4 /= 4; // n4 = n4 / 4
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);
		
		// 비교 연산자
		int var1 = 1;
		int var2 = 2;
		
		boolean rs1 = var1 > var2;	// var1은 var2보다 크다
		boolean rs2 = var1 < var2;	// var1은 var2보다 작다
		boolean rs3 = var1 >= var2;	// var1은 var2보다 크거나 같다
		boolean rs4 = var1 <= var2;	// var1은 var2보다 작거나 같다
		boolean rs5 = var1 == var2;	// var1은 var2보다 서로 같다
		boolean rs6 = var1 != var2;	// var1은 var2보다 서로 다르다
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		System.out.println("rs5 : " + rs5);
		System.out.println("rs6 : " + rs6);
		
		
		// 논리 연산자
		int var3 = 3;
		int var4 = 4;
		
		boolean r1 = (var3 > 3) && (var4 > 3);	// var3은 3보다 크고 그리고 var4는 3보다 크다
		boolean r2 = (var3 > 2) && (var4 > 3);	// var3은 2보다 크고 그리고 var4는 3보다 크다
		boolean r3 = (var3 > 3) || (var4 > 3);	// var3은 3보다 크고 또는 var4는 3보다 크다
		boolean r4 = (var3 > 3) || (var4 > 4);	// var3은 3보다 크고 또는 var4는 4보다 크다
		boolean r5 = !(var3 > var4); // var3은 var4보다 크지 않다 
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		System.out.println("r5 : " + r5);
		
		// 삼항 연산자
		int n = 11;
		
		String rs = (n > 10) ? ("n은 10보다 크다") : ("n은 10보다 작다");
		System.out.println("rs : " + rs);
		
		// 비트 연산자
		int a = 5; // 0101
		int b = 3; // 0011
		
		System.out.println("a & b = " + (a & b)); // 비트 AND 연산
		System.out.println("a | b = " + (a | b)); // 비트 OR 연산
		System.out.println("a ^ b = " + (a ^ b)); // 비트 XOR 연산
	}
}
