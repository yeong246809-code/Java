package sub1;

class Solution {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;//총 사용량 초기화
        
        for(int i=0; i<change.length; i++){//중복문 사용으로 change배열각각 비교
            usage = total_usage * change[i] / 100;//총 사용량 비례 달사용량 퍼센테이지 계산
            total_usage += usage;//총 사용량에 달 사용량 추가
            if(total_usage > storage){//총 사용량이 남은물보다 많을때가 몇달인지 리턴
                return i;
            }
        }
        return -1;
    }
}

public class PCCE_6 {
	public static void main(String[] args) {
		System.out.println();
	}
}
