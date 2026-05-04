package Sub_4;

public class Person {

	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public void work() {
		System.out.println("person is working");
	}
	public void introduce() { 
		System.out.println("제 이름은 " + this.name + "이고 제 나이는" + this.age + "입니다" );
	}
	
	
	
}
