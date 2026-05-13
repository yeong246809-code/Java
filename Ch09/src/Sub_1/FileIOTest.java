package Sub_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 날짜 : 2026-05-13
 * 이름 : 이찬영
 * 내용 : Java FileIO 실습
 */
public class FileIOTest {

	public static void main(String[] args) {
		
		// 입출력 파일 경로 설정
		String sourse = "C:\\Users\\GGG\\Desktop\\test1.txt";
		String target = "C:\\Users\\GGG\\Desktop\\test2.txt";
		
		// 스트림 생성
		try {
			FileInputStream fis = new FileInputStream(sourse);
			FileOutputStream fos = new FileOutputStream(target);
			
			while(true) {
				
				int data = fis.read();// 파일 읽기
				
				if(data == -1) { // 파일 내용이 없으면
					break;
				}
				// 문자 변경
				//char ch = (char) data;
				//System.out.print(ch);
				//파일 쓰기
				fos.write(data);
			}
			
			//스트림 연결 해제
			fis.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}
	
}
