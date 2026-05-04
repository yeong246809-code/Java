package Sub_4;

public class Doctor extends Person {

	private String specialty;
	
	public Doctor(String name, int age, String specialty) {
		
		super(name, age);
		this.specialty = specialty;
	
	}
	
	public void work() {
		
		this.introduce();
		System.out.println("저는 의사 이며 전공은" + this.specialty + "입니다.");
	
	}
	

}
