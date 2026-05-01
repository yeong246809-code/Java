package sub1;
/**
 * 날짜 : 2026-04-08
 * 이름 : 이찬영
 * 내용 : 자바 배열 실습하기
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		// 배열 선언
		int[] arr1 = {1, 2, 3, 4, 5};
		char[] arr2 = {'A', 'B', 'C'};
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"};
		
		// 배열값(원소) 출력
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[2] : " + arr1[2]);
		
		System.out.println("arr2[1] :" + arr2[1]);
		System.out.println("arr3[3] :" + arr3[3]);
		
		//배열 길이(전체 원소 갯수)
		System.out.println("arr1 길이 :" + arr1.length);
		System.out.println("arr2 길이 :" + arr2.length);
		System.out.println("arr3 길이 :" + arr3.length);
		
		//배열 반복문
		for(int i=0 ; i<arr1.length ; i++) {
			System.out.println("arr[" + i + "] : " + arr1[i]);
		}
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println("arr[" + i + "] : " + arr2[i]);
		}
		
		for(int i : arr1) {// 배열 길이 만큼 반복하면서 배열 원소를 순서대로 반복변수에 할당 
			
			System.out.print(i + ",");
			}
		
		System.out.println();
		for(char n : arr2) {
			System.out.print(n + ",");
			}
		
		System.out.println();
		
		for(String k : arr3) {
			System.out.print(k + ",");
			}
		
		System.out.println();
		
		/////////////////////////////////////////////////////////////////////////////////////
		
		
		// 1차원 배열
		int[] scores = {80, 60, 50, 70, 90};
		
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		
		System.out.println("scores 점수합 :" + total);
		
		
		// 2차원 배열
		int[][] arr2d = { {1, 2, 3, 4}, 
						  {5, 6, 7, 8}, 
						  {9,10,11,12} };
		System.out.println("arr2d[0][0] : " + arr2d[0][0]);
		System.out.println("arr2d[0][2] : " + arr2d[0][2]);
		System.out.println("arr2d[1][0] : " + arr2d[1][0]);
		System.out.println("arr2d[1][3] : " + arr2d[1][3]);
		System.out.println("arr2d[2][1] : " + arr2d[2][1]);
		System.out.println("arr2d[2][2] : " + arr2d[2][2]);
		
		
		
		// 3차원 배열
		int[][][] arr3d = { {{1,2,3}, 
							 {4,5,6}, 
							 {7,8,9}},
							{{10,11,12}, 
							 {13,14,15}, 
							 {16,17,18}}, 
							{{19,20,21}, 
							 {22,23,24}, 
							  {25,26,27}}};
		System.out.println("arr3d[0][0][1] : " + arr3d[0][0][1]);
		System.out.println("arr3d[0][1][2] : " + arr3d[0][1][2]);
		System.out.println("arr3d[1][0][0] : " + arr3d[1][0][0]);
		System.out.println("arr3d[1][1][2] : " + arr3d[1][1][2]);
		System.out.println("arr3d[2][0][2] : " + arr3d[2][0][2]);
		System.out.println("arr3d[2][1][0] : " + arr3d[2][1][0]);
		System.out.println("arr3d[2][2][1] : " + arr3d[2][2][1]);
		
		
	}
	
}
