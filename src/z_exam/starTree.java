package z_exam;

public class starTree {

	public static void main(String[] args) {
		/*for(int i = 0; i < 10; i++){		//10줄
			for(int j=0; j < 10 - i; j++){  //공백
				System.out.print(" ");
			}
			for(int j = 0; j < i * 2 + 1; j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		//역삼각형
		for(int i =0; i < 11; i++){  //길이
			for(int j= 0; j < i; j++){  //공백
				System.out.print(" ");
			}
		
			for(int j = 0; j < 11 - 2 * i ; j++){  //10, 8,6..순으로 내려가서 마지막 0이기 떄문에 +1로 꼭지점 만들어준다
				System.out.print("*");
			}	
			System.out.println();
			
		}
	}

}
