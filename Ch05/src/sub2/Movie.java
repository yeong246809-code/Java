package sub2;

public class Movie {

	private String title;
	private String director;
	private double rating;
	private int availableSeats;
	
	public Movie(String title,String director,double rating,int availableSeats ) {
		this.title = title;
		this.director = director;
		this.rating = rating;
		this.availableSeats = availableSeats;  
	}
	
	public boolean reserveSeat() {
		if(this.availableSeats > 0) {
			this.availableSeats--;
			return true;
		}else {
			return false;
		}
	}
	public void cancleReservation(){
		this.availableSeats++;
	}
	public void showDetails() {
		System.out.println("영화 제목 : " + title);
		System.out.println("영화 감독 : " + director);
		System.out.println("영화 평점 : " + rating);
		System.out.println("예매가능좌석 : " + availableSeats);
	}
}
