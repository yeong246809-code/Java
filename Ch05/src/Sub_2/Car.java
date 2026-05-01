package Sub_2;

public class Car {

	//속성(멤버변수)
	private String brand; 
	private String color; 
	private int speed;
	
	
	//기본 생성자
	public Car() {}
	//생성자 : 속성을 초기화하는 메서드
	
	public Car(String brand, String color, int speed) {
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}
	
	//Getter/Setter 외부에 안전하게 속성 제공, 생성자 대신 초기화/초기화된 속성값 수정
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getspeed() {
		return speed;
	}
	public void setspeed(int speed) {
		this.speed = speed;
	}
	
	
	
	//기능(멤버 메서드)
	public void speedUp(int speed) {
		//this : 클래스의 멤버변수를 참조하는 키워드
		this.speed += speed;
		
		
		
	}
	public void speedDown(int speed) {
		
		this.speed -= speed;
		
	}
	public void show() {
		
		System.out.println("차량명 : " + brand);
		System.out.println("색상 : " + color);
		System.out.println("현재속도 : " + speed);
		
	}
	
	
}
