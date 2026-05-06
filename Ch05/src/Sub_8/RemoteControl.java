package Sub_8;


// 인터페이스 : 오직 추상 메서드만 갖는 구조
public interface RemoteControl {

	//인터페이스는 속성을 갖지 않음
	
	public void poweron();
	public void poweroff();
	
	public void chup(); // abstract 키워드 생략가능
	public void chdown();

	public void soundup();
	public void sounddown();
	
}
