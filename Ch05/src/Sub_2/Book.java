package Sub_2;

public class Book {

	private String title;
	private String author;
	private int copies;
	
	
	public Book(String title, String author, int copies) {
		
		this.title = title;
		this.author = author;
		this.copies = copies;
		
	}
	
	public boolean borrowBook() {
		
		if(this.copies >= 1) {
			this.copies--;
			return true;
		}
		return false;
		
	}
	public void returnBook() {
		this.copies++;
	}
	public void show() {
		System.out.println("제목 : " + title);
		System.out.println("지은이 : " + author);
		System.out.println("복사본 : " + copies);
	}
	
}
