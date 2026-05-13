package Sub_4;

import java.io.File;
import java.io.IOException;

/**
 * 날짜 : 2026-05-13
 * 이름 : 이찬영
 * 내용 : Java File 클래스 실습
 * 
 */
public class FileTest {

	public static void main(String[] args) {
		String sourse = "C:\\Users\\GGG\\Desktop\\test3.txt";// 파일
		String target = "C:\\Users\\GGG\\Desktop\\test";//디렉토리
	
		//파일 객체 생성
		File f1 = new File(sourse);
		File f2 = new File(target);
	
		try {
			//파일 생성
			f1.createNewFile();
			f2.mkdir();
			
			//파일정보
			System.out.println("f1 존재여부 : " + f1.exists());
			System.out.println("f2 존재여부 : " + f2.exists());
			System.out.println("f1 파일여부 : " + f1.isFile());
			System.out.println("f2 폴더여부 : " + f2.isDirectory());
			System.out.println("f1 파일이름 : " + f1.getName());
			System.out.println("f2 파일이름 : " + f2.getName());
			System.out.println("f1 파일경로 : " + f1.getPath());
			System.out.println("f2 파일경로 : " + f2.getPath());
			System.out.println("f1 절대경로 : " + f1.getAbsolutePath());
			System.out.println("f2 절대경로 : " + f2.getAbsolutePath());
			
			//파일 삭제
			f1.delete();
			f2.delete();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
