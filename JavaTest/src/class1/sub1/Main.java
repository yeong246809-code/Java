package class1.sub1;

public class Main {

	public static void main(String[] args) {
		
		StudentScore student = new StudentScore("홍길동","S001","자바",90.0);
		
		student.printStudentInfo();
		System.out.println("-------------------------");
		
		student.updateScore(98.0);
		System.out.println("-------------------------");
		
		student.updateScore(102.0);
		System.out.println("-------------------------");
		
		student.printStudentInfo();
		System.out.println("-------------------------");
	}
	
}
class StudentScore{
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	public StudentScore(String studentName,String studentId,String subject,double score) {
		
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	public void updateScore(double newScore) {
		if(1 <= newScore && newScore <= 100) {
			System.out.println("점수 수정완료");
			this.score = newScore; 
		}else {
		System.out.println("잘못된 점수 입력");
		}
	}
	public double getScore() {
		return score;
	}
	public void printStudentInfo() {
		System.out.println("학새명 : " + studentName);
		System.out.println("학생 아이디 : " + studentId);
		System.out.println("과목명 : " + subject);
		System.out.println("과목 점수 : " + score);
	}
}
