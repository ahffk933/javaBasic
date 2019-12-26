package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 *  << 정렬 >>
		 *  - 선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은 수와 자리 바꾸기를 반복해 
		 *  			'앞에서' 부터 '작은 수'를 채워나가는 방식
		 *  - 버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은 수와 자리바꾸기를 반복해 
		 *  			'뒤에서' 부터 '큰수'를 채워나가는 방식
		 *  - 삽입정렬 : '두번째' 숫자부터 그 앞의 모든 숫자들과 비교해서 '큰 수들을 뒤로 밀고 중간에 삽입'하는 방식
		 *  - 석차구하기 : 모든 점수가 1등으로 시작해 다른 점수들과 비교해 자신의 점수가 작으면 등수를 1씩 증가시키는 방식
		 */
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = i + 1;
		}
		shuffle(numbers);
		System.out.println(Arrays.toString(numbers));
		
//		selectSort(numbers); //선택정렬
//		bubbleSort(numbers); //버블정렬
//		insertSort(numbers); //삽입정렬
		printRank(numbers);

//		System.out.println(Arrays.toString(numbers));
	}

	private static void printRank(int[] numbers) { //numbers가 =점수
		int[]grade = new int[]{1,1,1,1,1,1,1,1,1,1};
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers.length; j++){
				if(numbers[i] < numbers[j])
					grade[i]++;
					
				}
				
			}
			System.out.println(Arrays.toString(grade));
			
			for(int i = 0; i < numbers.length; i++){
				System.out.println(numbers[i] + " : " + grade[i] + "등");
			}
		
		
		
		
	}

	private static void insertSort(int[] numbers) {
		for(int i = 1; i < numbers.length -1; i++){
			int temp = numbers[i];
			int j = 0;
			for(j = i - 1 ; j >= 0; j--){
				if(temp < numbers[j]){
					numbers[j + 1] = numbers[j]; //j= j+1 ->한칸 뒤로
					
				}else{
					break;
				}
			}
			numbers[j + 1] = temp;
		}
		
		
	}

	private static void bubbleSort(int[] numbers) {
		/*
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8 8,9 
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 7,8
		 * 0,1 1,2 2,3 3,4 4,5 5,6 6,7 
		 * 0,1 1,2 2,3 3,4 4,5 5,6 
		 * 0,1 1,2 2,3 3,4 4,5
		 * 0,1 1,2 2,3 3,4        //중간이 자리가 한자리도 안바뀌면 정렬이 끝난 것이므로 종료~
		 * 0,1 1,2 2,3 
		 * 0,1 1,2
		 * 0,1
		 */
		for(int i = 0; i < numbers.length; i++){  //i는 고정되어있고, j가 계속 움직이는 애
			boolean changed = false;
			for(int j = 0; j < numbers.length-1-i; j++){  //한바퀴 돌때마다 
				if(numbers[j] > numbers[j +1 ]){   //0과 1비교, 1과 2비교...그래서 +1
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					changed = true;
				}
			}
			if(!changed){
				break;
			}
		}
		
	}

	private static void selectSort(int[] numbers) {
		for(int i = 0; i < numbers.length -1; i++){ //맨마지막 숫자는 돌려줄 필요 없으므로 -1
			for(int j = i + 1; j < numbers.length; j++){ //안쪽 for문 (j)가 1부터 9까지 한바퀴 다 돌면  바깥 for문에 i가 i++(1증가)
				if(numbers[i] > numbers[j]){             //i가 1됐어 j쪽에서 다시 1~9돌고 ,이제 i가 2....안쪽for먼저 -> 바깥for실행 
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				
				}		
			}
		}			
	}
		
		
	

	private static void shuffle(int[] numbers) {
		for(int i = 0; i < numbers.length * 10; i++){
			int random = (int)(Math.random()* numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}
		
	}

}
