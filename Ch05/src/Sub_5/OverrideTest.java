package Sub_5;
/**
 * 날짜 : 2026-05-04
 * 이름 : 이찬영
 * 내용 : java 오버라이딩 실습
 * 
 */
class AAA{
	public void method1() {
		System.out.println("AAA:method1...");
	}
	public void method2() {
		System.out.println("AAA:method2...");
	}// Overload
	public void method3() {
		System.out.println("AAA:method3...");}
}
class BBB extends AAA{	
	@Override
	public void method2() {
		System.out.println("BBB:method2...");
	}
	public void method3(int a) {
		System.out.println("BBB:method3...");
	}
	}
class CCC extends BBB{
	
	// @Override 이노테이션 : Override 메서드를 표기하는 키워드, 기능은 없음
	public void method1() {
		System.out.println("CCC:method1...");
	}@Override
	public void method2() {
		System.out.println("CCC:method2...");
	}//Override
	public void method3(int a, int b) {
		System.out.println("CCC:method3...");
	}
}




public class OverrideTest {

	public static void main(String[] args) {
		
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1, 2);
		
		//Car Override 메서드 실습
		System.out.print("\n");
		Sedan avante = new Sedan("아반테", "흰색", 0, 1500);
		avante.speedUp(260); // Override 메서드 실행
		avante.drive();
		System.out.print("\n");
		Truck poter = new Truck("포터", "흰색", 0,0);
		poter.speedUp(200); // Override 메서드 실행
		poter.show();
	
		//animal
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
	}
	
	
	
}
