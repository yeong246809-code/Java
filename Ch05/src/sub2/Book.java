package sub2;

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
		if(copies > 0) {
			copies--;
			return true;
		}else {
			return false;
		}
		
	}
	public void returnBook() {
		copies++;
	}
	public void show() {
		System.out.println("책 제목 :" + title);
		System.out.println("책 저자 :" + author);
		System.out.println("책 대여 가능한 수 :" + copies);
	}
}
