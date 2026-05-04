package Sub_4;
/**
 * 
 * 날짜: 2026-05-04
 * 이름: 이찬영
 * 내용: Java 상속 실습
 * 
 * 
 */
public class InteritanceTest {

	public static void main(String[] args) {
		
		//Car 상속객체 sedan 생성
		Sedan sonata = new Sedan("소나타", "은색", 0, 1800);
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.drive();
		
		// Car 상속개체 Truck
		
		Truck bongo = new Truck("봉고", "블루", 0, 0);
		
		bongo.load(100);
		bongo.speedUp(80);
		bongo.show();
		
		// Account
		
		StockAccount kb = new StockAccount("kb증권", "110-12-0011", "홍길동", 0, "삼성전자", 0, 0);
		kb.deposit(1000000);
		kb.buy(10,100000);
		kb.show();
		kb.sell(5, 150000);
		kb.show();
		
		//Person
		
		Doctor kim = new Doctor("김유신", 24, "소아과");
		kim.work();
		
		
		Engineer lee = new Engineer("이순신", 24, "SW개발");
		lee.work();
		
	}
	
	
}
