package sub4;
/**
 * 날짜 : 2026-04-08
 * 이름 : 이찬영
 * 내용 : 자바 반복문 실습하기 
 */
public class WhileTest {

	public static void main(String[] args) {
			
		//while
		int i = 0;// 반복변수
		
		while(i <= 10) { // 반복조건
			
			System.out.println("i :" + i);
			
			//반복변수 증가
			i++;
			
		}
		
		// 1부터 10까지 합
		int sum = 0;
		int k = 1;
		
		while(k<=10) {
			
			sum += k;
			k++;
		}
			System.out.println("1부터 10까지 합 :" + sum);
			
			//1부터 10까지 홀수합
			int tot = 0;
			int j = 1;
			
			while(j<=10) {
				
				if(j % 2 == 1) {
					tot += j;
				}
				j++;
			}
			
			System.out.println("1부터 10까지 홀수합 :" + tot);
			
			// do-while : 최초 무조건 한번 수행하는 반복문
			
			int m = 0;
			
			
			do {
				
				System.out.println("m : " + m);
				m--;
			}while(m>=0);
			
			//break : 반복문 탈출
			int num = 1;
			
			
			
			while(true) {
				
				if(num % 5 == 0 && num % 7 == 0) {
					break;
					
				}
				
				num++;
				
			}
			
			System.out.println("5와 7의 최소공배수 :" + num);
			
			//continue
			
			int total = 0;
			int p = 1;
			
			while(p<=10) {
				p++;
				
				if(p % 2 == 1) {
					
					continue;// 반복문 처음으로 이동
				}
				
				total += p;
				
				
			}
			
			System.out.println("1부터 10까지 짝수합 :" + total);
	}
}
