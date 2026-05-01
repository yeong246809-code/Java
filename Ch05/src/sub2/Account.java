package sub2;

public class Account {

	
	private String bank;
	private String accNum;
	private int balance;
	
	public Account(String bank, String accNum,int balance) {
		this.bank = bank;
		this.accNum = accNum;
		this.balance = balance;
		
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	public boolean withdraw(int amount) {
		if(amount <= balance) {
			this.balance -= amount;
			return true;
		}else {
			return false;
		}
	}
	
	public void show() {
		System.out.println("은행명 :" + bank);
		System.out.println("계좌번호 :" + accNum);
		System.out.println("잔액 :" + balance);
	}
}
