package Sub_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 날짜 : 2026-05-13
 * 이름 : 이찬영
 * 내용 : Java 직렬화 실습
 * 
 */
public class DesirializeTest {

	public static void main(String[] args) {
		
		//경로
		String path = "C:\\Users\\GGG\\Desktop\\apple.data";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			//역직렬화를 위한 보조 스트림
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 객체 역직렬화(가져오기)
			Apple apple = (Apple) ois.readObject();
			apple.show();
			
			//스트림 해제
			ois.close();
			fis.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
	
}
