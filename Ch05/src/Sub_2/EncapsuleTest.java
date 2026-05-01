package Sub_2;
/**
 * 날짜: 2026-04-29
 * 이름: 이찬영
 * 내용: Java 캡슐화 실습
 * 
 */
public class EncapsuleTest {

	public static void main(String[] args) {
		
		//객체 생성
		Car sonata = new Car("소나타","흰색", 0);
		Car avante = new Car();
		//속성값 수정
		avante.setBrand("아반테");
		avante.setColor("은색");
		avante.setspeed(100);
		
		System.out.println("차량명 : " + avante.getBrand());
		System.out.println("색상 : " + avante.getColor());
		System.out.println("현재속도 : " + avante.getspeed());
		
		//객체 초기화 -> 캡슐화된 속성을 생성자로 초기화
		
		sonata.show();
		System.out.print("\n");
		avante.show();
		
		// Account 객체 생성
		System.out.print("\n");
		Account kb = new Account("국민은행","123-11-1234","이순신",5000);
		kb.show();
		System.out.print("\n");
		
		//Book 객체 생성
		
		Book bk = new Book("이것이 자바다","신용권",5);
		Book bk1 = new Book("웹표준의 정석","고경희",5);
		
		bk.show();
		System.out.print("\n");
		bk1.show();
		
		//Member 객체 생성
		
		Member mb = new Member("이순신",19,false);
		Member mb1 = new Member("김춘추",25,true);
		System.out.print("\n");
		mb.show();
		System.out.print("\n");
		mb1.show();
		
		//Movie
		
		Movie mv = new Movie("타이타닉","제임스카메론",9.0 ,300);
		mv.showDetail;
		
		
		
		
		
		
		
	}
	
}
