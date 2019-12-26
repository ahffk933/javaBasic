package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * << if >> - if : 조건식의 결과가 true 이면 블럭안의 문장을 수행함 - else if : 다수의 조건이 필요할
		 * 때 if 뒤에 추가 - else : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가
		 */
		int a = 10;
		if (a < 100) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		if (a < 10) {
			System.out.println("조건식의 연산결과가 false면 수행되지 않는다.");
		}
		int regNo = 5; // 주민등록번호 첫자리
		String gender = null; // 성별

		if (regNo == 1) {
			gender = "남자";

		} else if (regNo == 2) { // if블럭 뒤에 else if로 조선을 추가할 수 있다
			gender = "여자";

		} else if (regNo == 3) {
			gender = "남자";
		} else if (regNo == 4) {
			gender = "여자";
		} else { // true인 조건식이 하나도 없을때 수행
			gender = "확인불가";
		}
		System.out.println("당신의 성별은" + gender + "입니다.");

		// 수행할 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합할 수 있다
		if (regNo == 1 || regNo == 3)
			gender = "MALE";
		else if (regNo == 2 || regNo == 4)
			gender = "FEMALE";
		else
			gender = "UNKNOWN";
		System.out.println("당신의 성별은" + gender + "입니다.");

		// 성적에 등급을 부여하는 프로그램을 만들어보자
		int score = 78;
		String grade = null;

		if (90 <= score) {
			grade = "A";
		} else if (80 <= score && score < 90) {
			grade = "B";
		} else if (70 <= score) {
			grade = "C";
		} else if (60 <= score) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은" + grade + "입니다.");

		// 등급 안에서 +와 -를 나누어보자
		score = 78;
		grade = null;

		if (90 <= score) {
			grade = "A";
			if (97 <= score) {
				grade = "+";
			} else if (93 >= score) {
				grade = "-";
			}
		} else if (80 <= score && score < 90) {
			grade = "B";
			if (87 <= score) {
				grade = "+";
			} else if (83 >= score) {
				grade = "-";
			}

		} else if (70 <= score && score < 80) {
			grade = "C";
			if (77 <= score) {
				grade = "+";
			} else if (73 >= score)
				grade = "-";
		} else if (60 <= score && score < 70) {
			grade = "D";
			if (67 <= score) {
				grade = "+";
			} else if (63 >= score)
				grade = "-";

		} else if (50 <= score && score < 60) {
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은" + grade + "입니다.");

		/*
		 * << switch문 >> - 조건식과 일치하는 case문 이후의 문장을 수행 - 조건식의 결과는!!!!정수와 문자열!!!!만
		 * (JDK1.7부터 문자열 허용) 허용됨
		 */
		regNo = 2;
		gender = null;

		switch (regNo) { // 조건식의 연산결과는 정수와 문자열만 허용
		case 1:
		case 3: // case문의 값은 리터럴과 상수만을 사용할 수 있다
			gender = "Male";
			break; // break를 만나면 switch문을 빠져나간다
		case 2:
		case 4:
			gender = "Female";
			break;

		default:
			gender = "Unknown";

		}
		System.out.println("당신의 성별은 " + gender + "입니다.");

		score = 95;
		grade = null;
		switch (score / 10) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "Fail";

		}
		System.out.println(score + "점에 해당하는 등급은" + grade + "입니다.");

		// 콘솔창에서 입력받는 방법
/*		Scanner s = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요>");
		String inputㅣ = s.nextLine(); // 사용자에게 입력받은 문자열을 반환한다
		System.out.println("입력받은 문자열 : " + inputㅣ);
		
		System.out.println("숫자를 입력해주세요>");
//		s.nextInt(); //버그가 있기 때문에 사용하지 말자!!
		int input2 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자 : " + input2);
		
		//문자열을 입력받고 입력받은 문자열을 출력하라
		System.out.println("문자열을 입력하라>");
		String input1 = s.nextLine();
		System.out.println("입력받은 문자열 : " + input1);
		
		System.out.println("숫자입력해>");
		int input4 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자 : " + input4);
*/		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지를 출력하라
/*		Scanner s = new Scanner(System.in);
		System.out.println("문자열 입력해>");
		int num = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 문자열 : " + num);
		if(num == 0){
			System.out.println("0 이다");
		}else {
			System.out.println("0이 아니다");
		}
*/		
/*		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력하라
		Scanner s = new Scanner(System.in);
		System.out.println("숫자입력>");
		int num = Integer.parseInt(s.nextLine());
		System.out.println("입력된 숫자 :" + num);
		if(num == '홀'){
			System.out.println("홀수이다");
		}else{
			System.out.println("짝수이다");
*/
		//점수 3개를 입력받아 총점, 평균, 등급을 출력하라
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력>");
		int num = Integer.parseInt(s.nextLine());
		System.out.println("두번째 숫자 입력>");
		int num1 = Integer.parseInt(s.nextLine());
		System.out.println("세번째 숫자 입력>");
		int num2 = Integer.parseInt(s.nextLine());
		
		int sum = num + num1 + num2;
		double avg = sum / 3.0;
		
		if(90 <= avg){
			grade = "A";
		}else if(80 <= avg){
			grade = "B";
		}else if(70 <= avg){
			grade = "C";
			
		}else if(60 <= avg){
			grade ="D";
		}
		System.out.println("총점은 : " + sum + "평균은: " + avg + "등급은: " + grade +"이다");
			
		}
		
		
		

	}

