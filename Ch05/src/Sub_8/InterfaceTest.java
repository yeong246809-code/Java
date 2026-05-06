package Sub_8;
/**
 * 날짜 : 2026-05-06
 * 이름 : 이찬영
 * 내용 : java 인터페이스 실습
 * 
 */
public class InterfaceTest {

	public static void main(String[] args) {
		
		// 인터페이스 활용1: 표준화된 클래스 설계
		RemoteControl lg = new RemoteLG(); // 다형성, 업캐스팅
		lg.poweron();
		lg.chdown();
		lg.soundup();
		lg.poweroff();
		
		RemoteControl samsung = new RemoteSamsung();
		
		samsung.poweron();
		samsung.chup();
		samsung.sounddown();
		samsung.poweroff();
		
		// 인터페이스 활용2 : 모듈간 결합도 완화 (유연성)
		
		Bulb bulb = new Bulb();
		Socket socket= new PowerCable(bulb);
		
		socket.switchon();
		socket.switchoff();
		
		// 인터페이스 활용3: 다중 상속 효과
		
		SmartTV stv = new SmartTV();
		
		stv.poweron();
		stv.connection();
		stv.surf();
		stv.chup();
		stv.process();
		stv.save();
		
		
		
	}
	
}
