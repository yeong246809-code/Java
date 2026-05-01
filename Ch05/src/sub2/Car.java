package sub2;

public class Car {

	
	// 속성(멤버 변수) - 클래스 속성은 무조건 private로 캡슐화 해야함
	private String name;
	private String color;
	private int speed;
	
	//캡슐화된 속성을 초기화하기 위해 생성자(클래스명과 동일한 반환타입이 없는 메서드) 정의
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	
	
	
	// 기능(멤버 메서드)
	public void speedUp(int speed) {
		
		//this : 현재 클래스를 지칭하는 키워드
		this.speed += speed;
		
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}
	
	public void show() {
		System.out.println("차량명 :" + this.name);
		System.out.println("차량색 :" + this.color);
		System.out.println("현재속도 :" + this.speed);
	}
	
	
}
