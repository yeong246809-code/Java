package sub2;
/**
 * 날짜 : 2026-04-09
 * 이름 : 이찬영
 * 내용 : 자바 캡슐화 실습하기
 * 
 */
public class EncapsuleTest {

	public static void main(String[] args) {
		
		Car sonata = new Car("소나타", "흰색", 0); //생성자 호출
		
		//캡슐화(은닉)된 속성은 직접 접근불가 하기 때문에 생성자로 초기화
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		
		sonata.speedUp(80);
		sonata.speedDown(60);
		sonata.show();
		
		//Account 캡슐화 객체 생성
		Account a1 = new Account("국민은행","13-13-123",0);
		a1.deposit(1000000);
		if(a1.withdraw(500000)) {
			System.out.println("출금 했습니다");
		}else {
			System.out.println("실패 했습니다");
		}
		a1.show();
		
		Book samgookji = new Book("삼국지", "나관중",2);
		if(samgookji.borrowBook()) {
			System.out.println("대출 했습니다");
		}else {
			System.out.println("실패 했습니다");
		}
		
		Member kim = new Member("김유신", 25, false);
		kim.activate();
		kim.show();
		
		if(kim.isAdult()) {
			System.out.println("성인 입니다");
		}else {
			System.out.println("미성년자 입니다");
		}
		
		//Movie 객체 생성
		Movie titanic = new Movie("타이타닉","제임스카메론",10.0,100);
		
		if(titanic.reserveSeat()) {
			System.out.println("영화 예매 완료");
		}else {
			System.out.println("영화 예매 실패");
		}
		titanic.showDetails();
		
		
	}
	
}
