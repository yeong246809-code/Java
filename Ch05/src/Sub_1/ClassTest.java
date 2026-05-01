package Sub_1;
/**
 * 날짜: 2026-04-29
 * 이름: 이찬영
 * 내용: Java 클래스 실습
 * 
 */
public class ClassTest {

	public static void main(String[] args) {
		
		//객체 생성
		Car sonata = new Car();
		
		//객체 초기화
		sonata.brand = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		//객체 활용
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car();
		
		avante.brand = "아반테";
		avante.color = "검정";
		avante.speed = 0;
		
		avante.speedUp(60);
		avante.speedDown(10);
		avante.show();
		
		//Account 객체 생성
		System.out.print("\n");
		
		Account kb = new Account();
		
		kb.bank = "국민은행";
		kb.id = "123-11-1234";
		kb.name = "김유신";
		kb.balance = 1000;
		
		kb.deposit(20000);
		kb.widthraw(5000);
		kb.show();
		
		System.out.print("\n");
		
		Account wr = new Account();
				
		wr.bank = "우리은행";
		wr.id = "101-22-1001";
		wr.name = "김춘추";
		wr.balance = 0;
		
		wr.deposit(20000);
		wr.widthraw(5000);
		wr.show();
		
		//Book
		System.out.print("\n");
		
		Book javabook = new Book();
		
		javabook.title = "이것이 자바다";
		javabook.author = "신용권";
		javabook.copies = 0; 
		
		boolean result = javabook.borrowBook();
		if(result) {
			System.out.println("대출 성공");
			javabook.show();
		}else {
			System.out.println("대출 실패");
			javabook.returnBook();
			javabook.show();
			
		}
		
		//Member
		System.out.print("\n");
		
		Member kim = new Member();
		/*
		kim.name = "김유신";
		kim.age = 21;
		kim.isActive = false;
		
		if(kim.isAdult()) {
			System.out.println("성인입니다.");
			kim.activate();
			kim.show();
		}else {
			System.out.println("미성년자입니다.");
			kim.deactivate();
			kim.show();
		}
		*/
		kim.name = "김유신";
		kim.age = 21;
		kim.isActive = false;
		
		kim.activate();
		boolean isAdult = kim.isAdult();
		
		if(isAdult) {
			kim.show();
			System.out.println("성인입니다.");
		}else {
			kim.show();
			System.out.println("미성년자입니다.");
		}
		
		
		
		
		
	}
	
}
