package b_operator;

public class ComparisonOperator {

	public static void main(String[] args) {
	/*
	 * << 비교 연산자 >>
	 * - < : 작다
	 * - > : 크다
	 * - <= : 작거나 같다
	 * - >= : 크거나 작다
	 * - == : 같다
	 * - != : 같지 않다
	 */
		
		boolean b = 10 < 20; //비교연산자의 연산결과는 boolean이다
		System.out.println(b);
		b = 10 < 20 - 15; //산술연산 후 비교연산을 수행한다
		System.out.println(b);
		
		b = 10 <= 10.0;
		System.out.println(b);
		b = 65 >= 'B'; //B=66이기 때문
		System.out.println(b);
		
		b = 10.0f == 10.0;
		System.out.println(b);
		b = 10.1f == 10.1; //float은 7자리까지는 정확하게 표현 /double은 15자리까지
		System.out.println(b);
		System.out.printf("%21.20f%n", 10.1f);
		System.out.printf("%21.20f%n", 10.1);
		//float과 double은 정밀도가 달라 float을 double로 형변환하면 소수점을 정확하게 비교할 수 x
		//double을 float으로 형변환해야 정확하게 비교 가능
		b = 10.1f == (float)10.1;
		System.out.println(b);
		
		//대소비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만
		//등가비교는 모든 타입을 할 수 o (같다 or같지않다)
		b = 'A' == 65;
		System.out.println(b);
		b = true != false;
		System.out.println(b);
		
		b = "abc" == "abc";
		System.out.println(b); //같은 스트링 리터럴은 같은 주소를 갖음
		b = "abc" == new String("abc"); //new는 새로운 주소를 생성
		System.out.println(b);
		//참조형 타입은 저장도니 메모리 주소를 비교하기 때문에
		//String은 등가비교 연산자로 내용을 비교할 수 x
		
		b = "abc".equals(new String("abc"));
		//equals를 사용하면 String의 내용을 비교할 수 있다
		System.out.println(b);
		b = !"abc".equals("ABC");
		//같지 않다의 결과를 얻기 위해서는 !(NOT)을 앞에 붙여줌
		
		//다음의 문장들을 코드로 작성 후 연산결과를 출력하라
		//1보다 2가 큰가?
		b = 1 < 2;
		System.out.println(b);
		
		b = ! "1".equals("2");
		System.out.println(b);
		
		//0은 100보다 작거나 같은가?
		b = 0 <= 100;
		System.out.println(b);
		
		
		//3.14f와 3.14는 다른가?
		b = 3.14f != 3.14;
		System.out.println(b);
		
		//"남자"와 "여자"는 다른가?
		b = ! "남자".equals (new String("여자"));
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
		

	

	}

}
