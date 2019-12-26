package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 *  << 다차원 배열 >>
		 *  - 배열안에 배열이 저장되어 있는 형태
		 */
		
		int[][] numbers = new int[2][3];   //[]는 타입 뒤에 넣던 변수뒤던 상관없음 대게 타입뒤에 넣긴함
		int numbers2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
		int[] number3[] = { {1, 2, 3}
						   ,{4, 5, 6}
						   ,{7, 8, 9} }; //new int를 생략하는경우 선언과 초기화 동시에 해줘야댐
		
		int[][] numbers4 = new int[3][]; //가변 배열 (크기를 일부만 지정)
		numbers4[0] = new int[3];
		numbers4[1] = new int[4];
		numbers4[2] = new int[10]; //이렇게 크기를 다르게 지정할 수 있음
		
//		numbers[0] = 10; //1차원에 값을 저장할 수 없다
		numbers[0] = new int[5]; //1차원에 배열을 저장할 수 있고
		numbers[0][0] = 10; //2차원에 값을 저장할 수 있음
		numbers[0][1] = 20;
		numbers[1][0] = 100; 
		
		System.out.println(numbers.length); //1차원 배열의 길이
		System.out.println(numbers[0].length); //2차원 배열의 길이
		
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers[i].length; j++){
				System.out.println(numbers[i][j]);
			}
		}
		
		System.out.println(Arrays.toString(numbers));
		
		for(int i = 0; i < numbers.length; i++){
			System.out.println(Arrays.toString(numbers[i])); //2차원 배열은 for문을 돌려줘야 값이 나옴?
		}
		
		int[][] scores = new int[3][5];
		/*
		 *  {{1, 2, 3, 4, 5},
		 *   {1, 2, 3, 4, 5},
		 *   {1, 2, 3, 4, 5}}
		 *  scores[1][3] = 두번째줄 4 임 (0부터 카운트)
		 *  sum : {300, 400, 500}
		 *  avg : {50, 70, 100}
		 */
		int[] sum = new int [scores.length]; //합계
		double[] avg = new double[scores.length]; //평균
		for(int i =0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j] = (int)(Math.random()*100) +1;
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		
		//총점과 평균을 구하라
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores.length; j++){
				sum[i] += scores[i][j];
		
		}
		avg[i] += (double) sum[i] / scores[i].length;
				
		System.out.println("총점: " + sum[i] + " / 평균 : " + avg[i]);
		}
		

	}

}
