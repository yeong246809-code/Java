package Sub_2;

public class Movie {

	
	private String title;
	private String director;
	private double rating;
	private int availableSeats;
	
	public void Movie(String title, String director, double rating, int availableSeats) {
		
		this.title = title;
		this.director = director;
		this.rating = rating;
		this.availableSeats = availableSeats;
		
	}
	public boolean reserveSeat() {
		
		if(availableSeats > 0) {
			availableSeats--;
			return true;
		}
		return false;
		
	}
	public void cancelReservation() {
		
		availableSeats++;
		
	}
	public void showDetails() {
		
		System.out.println("제목: " + title);
		System.out.println("감독: " + director);
		System.out.println("평점: " + rating);
		System.out.println("예약가능 좌석 수: " + availableSeats);
		
	}
	
	
	
	
}
