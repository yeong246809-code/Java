package Sub_1;

public class Member {

	String name;
	int age;
	boolean isActive;
	
	
	public void activate() {
		isActive = true;
	}
	public void deactivate() {
		isActive = false;
	}
	public boolean isAdult() {
		
		if(age >= 20) {
			return true;
		}
		return false;
		
	}
	public void show() {
		System.out.println("회원명 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("활성회원 여부 : " + isActive);
	}
	
	
	
}
