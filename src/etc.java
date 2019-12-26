
public class etc {

	public static void main(String[] args) {
		/*
		 *  << 비트 연산자 >>
		 *  - |(OR) : 피연산자 중 한 쪽이라도 값이 1이면, 1을 그 외는 0을 결과로 얻음
		 *  - &(AND) : 피연산자 중 양쪽이 모두 1이어야 1을 그외는 0
		 *  - ^(XOR) : 피연산자의 값이 서로 다를 때만 1을, 같은 때는 0
		 *  - ~(비트전환) : 피연산자를 0은 1로 1은 0으로 바꿈
		 *  - <<(쉬프트) : 피연산자의 각 자리를 왼쪽으로 이동시킴. 빈칸은 0으로 채움
		 *  - >>(쉬프트) : 피연산자의 각 자리를 오른쪽으로 이동시킴. 빈칸은 앞자리와 동일한 값으로 채움
		 *  
		 *  <<기타 연산자>>
		 *  - .(참조연산자) : 특정 범위 내에 속해있는 멤버를 지칭할 때 사용
		 *  - (type) : 형변환(casting)
		 *  - ?:(삼항연산자) : 조건식 ? 조건식이 참일 경우 수행한 문장 : 조건식이 거짓일 경우 수행할 문장
		 *  - instanceof : 참조형차입 확인
		 */
		
		//1바이트는 8비트로 이루어져있고 1비트는 0 또는 1을 표현할 수 있다
		//즉, 1바이트는 8개의 0 또는 1을 표현할 수 있다
		/*
		 * - 10진수 -> 2진수 : 10진수 값을 1이 될때까지 2로 나눔
		 * 10
		 * 5 0
		 * 2 1
		 * 1 0
		 * -> 1010
		 * 
		 * 15를 2진수로 만들어라
		 * 15
		 * 7 1
		 * 3 1
		 * 1 1
		 * -> 1111
		 * 
		 * - 2진수 -> 10진수 : 각 자리에 1, 2, 4, 8, 16, 32...를 곱한 값을 더한다
		 * 1 0 1 0
		 * 8 4 2 1
		 * 8+0+2+0 = 10
		 * 
		 * 1111을 10진수로 만들어라
		 * 1 1 1 1 
		 * 8 4 2 1
		 * 8+4+2+1 = 15  
		 */	
		//00001010 : 10
		//00001111 : 15
		
		//| : 00001111
		System.out.println(10 | 15);
		//& : 00001010
		System.out.println(10 & 15);
		//^ : 00000101
		System.out.println(10 ^ 15);
		//~ : 11110101
		System.out.println(~ 10);
		//<< : 00010100
		System.out.println(10 << 1); //(이동 1칸의 1)
		//>> : 00000101
		System.out.println(10 >> 1);
		
		int x = 10;
		int y = 20;
		int result = x < y ? x : y;
		//true : int result = x;
		//false : int result = y;
		System.out.println(result);
		
		//시험점수가 60점 이상이면 합격 미만이면 불합격
		int score = 50;
		String res = 60 <= score ? "합격" : "불합격";
		System.out.println(score + "점은" + res + " 입니다.");
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 3; //주민번호 첫자리
		String gender = regNo == 1 ? "Male" : "Female";
		System.out.println("당신의 성별은 " + gender + " 입니다");
		
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가");
		System.out.println("당신의 성별은 " + gender + " 입니다.");
		
//		//두개의 변수에 저장된 수 중 큰 숫자를 출력
		int a = 10;
		int b = 20;
		int bigger = a < b ? b : a;
		System.out.println(bigger);
		
		//변수에 저장된 수의 절대값을 출력하라
		int c = -5;
		int abs = 0 <= c ? c : -c;
		System.out.println(abs);
		
		//변수에 저장된 주민등록번호 뒷자리의 첫번째 숫자가 1이나 3이면 남자를
		//2나 4면 여자를 출력하라
		//그 외의 숫자는 확인불가로 출력하라
		int d = 3;
		String gen = d == 1 || d == 3 ? "male" : d == 2 || d == 4 ? "Female" : "Unknown";
		System.out.println("당신의 성별은 " + gen + " 입니다.");
			
		
		
	
		
		
}

		
		
	}
}