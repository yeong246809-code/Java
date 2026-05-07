package Sub_9;

import Sub_9.Outer.inner;

/**
 * 날짜 : 2026-05-07
 * 이름 : 이찬영
 * 내용 : Java 중첩 클래스 (내구 클래스, 익명 객체) 실습
 * 
 */
//외부 클래스
class Outer{
	private int x;
	
	public Outer(int x) {
		this.x = x;
		
	}
	public void show() {
		System.out.println("Outer x : " + x);
	}
	//내부 클래스
	class inner{
		private int x;
		
		public inner(int x) {
			this.x = x;
		}
		public void show() {
			System.out.println("inner x : " + x);
		}
	}
}

public class NestedTest {

	public static void main(String[] args) {
		
		// 외부 객체 생성
		Outer out = new Outer(1);
		out.show();
		
		//내부 객체 생성
		inner inn = out.new inner(2);
		inn.show();
		
		
	}
	
}
