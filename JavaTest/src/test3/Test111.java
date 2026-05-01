package test3;


public class Test111 {
    
	public static void main(String[] args) {
		
		System.out.println("배열에서 2번째로 큰수: " + solution());
		
		
	}
	
	
	public static int solution() {
        
    	int[] arr = {10,20,5,30,25};
    	int max = arr[0];
    	int sec = Integer.MIN_VALUE;
    	for(int i = 1 ; i <= arr.length - 1 ; i++) {
    		
    		if(arr[i] >= max) {
    			
    			max = arr[i];
    			
    		}else if(arr[i] < max && arr[i] > sec) {
    			
				sec = arr[i];
    		
    		}
    	}
    	
       return sec;
        
    }
   
}