package Sub_7;
/**
 * 날짜 : 2026-05-06
 * 이름 : 이찬영
 * 내용 : java 추상 클래스 실습
 * 
 */

public  class AbstractTest {

	public static void main(String[] args) {
		
		Sub_6.Animal animal = new Sub_6.Animal(); // 추상 클래스가 아니므로 생성가능
		//Sub_7.Animal animal = new Sub_7.Animal(); // 추상 클래스 이므로 생성 불가능
		
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		Shark shark = new Shark();
		
		Animal[] animals = {tiger, eagle, shark};
		
		for(Animal a : animals) {
			a.move();
		}
		
	}
	
}
