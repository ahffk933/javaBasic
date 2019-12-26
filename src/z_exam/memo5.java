package z_exam;

public class memo5 {

//	public static void main(String[] args) {
		

		
/*		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20}, 
				{30,30,30,30,30}
				};
				int total = 0;
				float average = 0;
				
				for(int i = 0; i < arr.length; i++){
					for(int j = 0; j < arr[i].length; j++){
						total += arr[i][j];
					}
				}
					average = (float)total /( arr.length * arr[0].length); 
					//same as (float)total /20
				
				System.out.println("total="+total);
				System.out.println("average="+average);
				 // end of main
				
				
				
				
				int[] ballArr = {1,2,3,4,5,6,7,8,9};
				int[] ball3 = new int[3];
				// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
				for(int i=0; i< ballArr.length;i++) {
				int j = (int)(Math.random() * ballArr.length);
				int tmp = 0;
				tmp = ballArr[j];
				ballArr[j] = ballArr[i];
				ballArr[i] = tmp;
				
				
				 }
				// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
				for(int i = 0; i < ball3.length; i++){
						ball3[i] = ballArr[i];
					}
						
						
						
					
				

				 
				for(int i=0;i<ball3.length;i++) {
				System.out.print(ball3[i]);
				}
		
				int[] coinUnit = {500, 100, 50, 10};
				int money = 2680;
				System.out.println("money="+money);
				for(int i=0;i<coinUnit.length;i++) {
				System.out.println(coinUnit[i]+ "원  : " + money / coinUnit[i]);
				money = money % coinUnit[i];
				}
				//7번
				 }
	
/*				if(args.length!=1) {
					System.out.println("USAGE: java Exercise5_7 3120");
					System.exit(0);
					}
*/					// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
	/*				int money1 = 2160;
					System.out.println("money="+money1);
					int[] coinUnit1 = {500, 100, 50, 10 }; // 동전의 단위
					int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
					for(int i=0;i<coinUnit1.length;i++) {
					int coinNum = 0;
					
//					1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
					coinNum = money1 / coinUnit1[i];
					
//					2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
//					(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
					if(coin[i] > coinNum){
						coin[i] -= coinNum;
					}else{
						coinNum = coin[i];
						coin[i] -= coinNum;
					}
					money1 -= (coinUnit1[i] * coinNum);
					
					System.out.println(coinUnit1[i]+"원: "+coinNum); }
					if(money1 > 0) {
						System.out.println("거스름돈이 부족합니다.");
						System.exit(0); // 프로그램을 종료한다.
						}
						System.out.println("=남은 동전의 개수 =");
						for(int i=0;i<coinUnit1.length;i++) {
						System.out.println(coinUnit1[i]+"원:"+coin[i]);
						}
			
						
						//8번
						
/*						int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
						int[] counter = new int[4];
						for(int i=0; i < answer.length;i++) {
							counter[answer[i]-1]++;
						   }
						for(int i=0; i < counter.length;i++) {
							System.out.print(counter[i]);
							
							for(int j =0; j < counter[i]; j++){
								System.out.print("*");
							}
						
	
						
						System.out.println();
						}
						
*/						
						
						
						//11
	/*					int[][] score = {
								{100, 100, 100}
								, {20, 20, 20}
								, {30, 30, 30}
								, {40, 40, 40}
								, {50, 50, 50}
								};
								int[][] result = new int[score.length+1][score[0].length+1];
								for(int i=0; i < score.length;i++) {
								for(int j=0; j < score[i].length;j++) {
									result[i][j] = score[i][j];
									result[i][score[i].length] += result[i][j];
									result[score.length][j] += result[i][j];
									result[score.length][score[0].length] += result[i][j]; 
								
								
								 }
								}
								for(int i=0; i < result.length;i++) {
								for(int j=0; j < result[i].length;j++) {
								System.out.printf("%4d",result[i][j]);
								}System.out.println();
								}
	*/					
						
						
						
						
	/*					
						
								char[][] star = {
								{'*','*',' ',' ',' '},
								{'*','*',' ',' ',' '},
								{'*','*','*','*','*'},
								{'*','*','*','*','*'}
								};
		char[][] result = new char[star[0].length][star.length];
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i< star.length; i++){
			for(int j=0; j< star[i].length; j++){
				
				result[j][i] = star[star.length-1-i][j];
			}
		}
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {

				int x = j;
				int y = star.length-1-i;
				result[x][y] = star[i][j];
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}			*/			
					
	
	
					
					
					
				

		
	}
}
