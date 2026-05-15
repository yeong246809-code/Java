package Sub_3;

import java.util.Scanner;

/**
 *  날짜 : 2026-05-15
 *  이름 : 이찬영
 *  내용 : Java preparedstatement 실습
 * 
 */
public class PreparedinsetTest {

	public static void main(String[] args) {
		
			System.out.println("데이터베이스 매니지먼트 프로그램");
			System.out.println("작업 선택 (1:입력, 2:조회, 3:수정, 4:삭제)");
			
			Scanner sc = new Scanner(System.in);
			boolean exit = false;
		while(!exit) {
			System.out.println("선택 : ");
			int choiced = sc.nextInt();
		
			switch (choiced) {
			case 0:
				exit = true;
				break;
			case 1:
				System.out.println("입력 작업");
				break;
			case 2:
				System.out.println("조회 작업");
				break;
			case 3:
				System.out.println("수정 작업");
				break;
			case 4:
				System.out.println("삭제 작업");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
	
}
