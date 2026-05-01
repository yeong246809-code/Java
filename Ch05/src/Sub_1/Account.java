package Sub_1;

public class Account {

	//속성(필드)
	String bank;
	String id;
	String name;
	int balance;
		
	//기능
	public void widthraw(int amount) {
		this.balance -= amount;
		
	}
	public void deposit(int amount) {
		this.balance += amount; 
		
	}
	public void show() {
		System.out.println("은행명 : " + bank);
		System.out.println("계좌번호 : " + id);
		System.out.println("입금주 : " + name);
		System.out.println("현재잔액 : " + balance);
		
	}
	
	
	
}
