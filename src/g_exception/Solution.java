package g_exception;

import java.lang.reflect.Array;

class Solution {
	new Solution().solution(12
			, new int[]{1, 3, 4, 9, 10}
			, new int[]{4, 2}
	
		public int solution(int n, int[] weak, int[] dist){
		int answer = 0;;
		
		int[] length = new int[weak.length];
		for(int i = 0; i < weak.length; i++){
			length[i] = weak[i + 1]-weak[i];
			if(i ==weak.length -1){
				length[i] = n - weak[i] + weak[0];
				
			}else{
				length[i] = weak[i + 1] - weak[i];
			}
		}
		for(int i = 0; i < dist.length; i++){
			for(int j = i + 1; j < dist.length; j++){
				if(dist[i] < dist[j]){
					int temp = dist[i];
					dist[i] = dist[j];
					dist[j] = temp;
				}
			}
			
		}
		System.out.println(Array.toString(length));
		
		
		
		
		
		return answer;
	}

}
