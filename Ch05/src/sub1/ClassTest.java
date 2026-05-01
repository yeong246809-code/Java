package sub1;
/**
 * 날짜 : 2026-04-09
 * 이름 : 이찬영
 * 내용 : 자바 클래스 실습하기
 */
public class ClassTest {

	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car();
		
		// 객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 상호작용
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		/*
		 * 객체(`avante`) 생성
		 * 객체 초기화 : 아반테, 검정, 0
		 * 
		 * 출력
		 * 차량명: 아반테
		 * 차량색: 검정
		 * 현재속도: 80
		 */
		Car avante = new Car();
		
		avante.name = "아반테";
		avante.color = "검정";
		avante.speed = 0;
		
		avante.speedUp(100);
		avante.speedDown(20);
		avante.show();
		
		//Book 객체 생성
		Book b1 = new Book();
		b1.title = "삼국지";
		b1.author = "나관중";
		b1.copies = 3;
		
		boolean result = b1.borrowBook();
		
		if(result) {
			System.out.println("도서 대출이 성공했습니다");
			
		}else {
			System.out.println("도서 대출이 실패했습니다");
		}
		b1.show();
		
		Member kim = new Member();
		kim.name = "김유신";
		kim.age = 23;
		kim.isActive = true;
		
		kim.deactivate();
		boolean rsl = kim.isAdult();
		
		if(rsl) {
			System.out.println("성인입니다");
		}else {
			System.out.println("미성인입니다");
		}
		
		Member lee = new Member();
		lee.name = "이순신";
		lee.age = 32;
		lee.isActive = false;
		
		lee.activate();
		lee.show();
		
		Account kb = new Account("국민은행", "123-123-123", 0);
		
		
		kb.deposit(1000000);
		boolean result1 = kb.withdraw(500000);
		
		if(result1) {
			System.out.println("출금 성공 입니다");
		}else {
			System.out.println("출금 실패입니다");
		}
		kb.show();
		
	
	}
	
	
	
}
