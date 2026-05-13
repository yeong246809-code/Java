package Sub_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 날짜 : 2026-05-13
 * 이름 : 이찬영
 * 내용 : java 보조 스트림 실습
 */

public class BufferIOTest {

	public static void main(String[] args) {
		
				// 입출력 파일 경로 설정
				String sourse = "C:\\Users\\GGG\\Desktop\\universe.mp4";
				String target = "C:\\Users\\GGG\\Desktop\\result.mp4";
				
				// 스트림 생성
				try {
					FileInputStream fis = new FileInputStream(sourse);
					FileOutputStream fos = new FileOutputStream(target);
					
					//보조 스트림(buffer)
					BufferedInputStream bis = new BufferedInputStream(fis);
					BufferedOutputStream bos = new BufferedOutputStream(fos);
					
					while(true) {
						
						int data = bis.read();// 파일 읽기
						
						if(data == -1) { // 파일 내용이 없으면
							break;
						}
						// 문자 변경
						//char ch = (char) data;
						//System.out.print(ch);
						//파일 쓰기
						bos.write(data);
					}
					
					//스트림 연결 해제
					bis.close();
					
					bos.flush();//버퍼 비워내기
					bos.close();
					
					fis.close();
					fos.close();
					
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				System.out.println("프로그램 종료");
		
	}
	
}
