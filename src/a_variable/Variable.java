package a_variable;

public class Variable {
	
	public static void main(String[] args) {
		/*
		 * << 변수 >>
		 * - 하나의 데이터를 저장할 수 있는 메모리상의 공간
		 * << 사용 가능한 기본형 데이터의 종류 >>
		 * - 정수(소수점x) : byte, short, int, long
		 * - 실수(소수점o) : float,(<) double
		 * - 문자 : char
		 * - 논리 : boolean(T\F)
		 * 
		 * - byte(0\1)는 8개의 bit로 이루어짐
		 * - 데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지,
		 * 	그것의 이름이 무엇인지 알려줘야 함 (8type중)
		 * - 명명규칙은 자바의 정석 P25~26 참조
		 */
		//변수 선언 방법 : 데이터 타입 + 변수 이름
		byte abc;
		char moonja;
		
		//모든 기본형 타입을 사용해서 8개의 변수를 선언하라.
		byte you;
		short are;
		int the;
		long best;
		float part;
		
		double of;
		char memo;
		boolean penguin;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용
//		System.out.println(you); //컴파일 에러 발생(문법 틀림)
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 x
		
		//=(대입 연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장
		you = 127; //타입에 맞는 값을 저장해야함 (127은 Byte값의 최고치임(-128~127))
		are = 30000;
		the = 20;
		best = 900L; //long 접미사 : L
		part = 3.14f; //double과 구분하기 위해 접미사 : f(Float)
		of = 3.14; //double 접미사 : d(생략가능)
		memo = '가'; //따옴표 묶어서 캐릭터 표현 '한개의 문자'
		penguin = true; //T\F만 적용 가능
		//초기화 : 변수에 처음으로 값을 저장하는 것
		
		System.out.println(the);
		//Ctrl + F11 : 프로그램 실행
		//F11 : 디버그 모드 실행
		
		the = 30;
		System.out.println(the);
		the = 30 + 40;
		System.out.println(the);
		the = are;
		
		//위에서 초기화한 변수에 새로운 값을 저장하고출력하라
		you = 125;
		are = 29999;
		the = 1;
		best = 800L;
		part = 3.11f;
		of = 3.11;
		memo = '다';
		penguin = false;
		
		System.out.println(you);
		System.out.println(are);
		System.out.println(the);
		System.out.println(best);
		System.out.println(memo);
		System.out.println(penguin);
		System.out.println(part);
		System.out.println(of);
		
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : ""(큰따옴표)로 감싸진 글자
		String _String = new String("abcd");
		_String = "1234";
		System.out.println(_String);
		
		/*
		 *  << 리터럴의 종류 >>
		 *  숫자 : 0, 10, -5, 3.14
		 *  문자 : '가', 'a', '0', ' '(공백도 문자)
		 *  문자열 : "가나다", "abc", "123"(숫자x,문자o), "  ", "" 
		 *  그외 : true, false, null(값이 없다)
		 *  
		 *  << 창조형 타입 >>
		 *  -기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
		 *  - ex) String, ABC, Variable...
		 *  - 값이 변수에 직접 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장됨
		 *  - 변수의 크기는 4byte
		 */
		
		
		//기본값(0) : 전역변수에 아무것도 자장하지 않았을때 저장되어 있는 값
		you = 0;
		are = 0;
		the = 0;
		best = 0L;
		part = 0f;
		of = 0.0;
		memo = '\u0000'; //' ' means '0'
		penguin = false;
		_String = null; //참조형타입의 기본값 'null'
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 함
		you = 127;
		the = 128;
		you = (byte)the; //형변환 : 데이터 타입을 변환한는 것
		System.out.println(you); //128 -> -128 (오버플로우)
		
		you = -128;
		the = -129;
		you = (byte)the;
		System.out.println(you); //-129 -> 127 (언더플로우)
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터 손실 우려
		
		//double type -> int type
		of = 3.14;
		the = 129;
		the = (int) of;
		System.out.println(the); //int는 소수점을 표현할 수 없으므로 소수점이 손실
		
		//표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다
		//그러므로 형변환 생략 가능
		the = you;
		best = the;
		of = the;
		of = part;
		
		
		/*
		 * << 상수 >>
		 * - 값을 한번 저장하면 변경할 수 없는 저장공산
		 * - final int MAX_NUMBER = 10;
		 * - 리터럴에 의미를 부여하기 위해 사용
		 */
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100; //컴파일 에러 발생
		
		변수 기본형 8타입
		변수 선언
		변수 사용 > 이름가지고 사용
		형변환 >타입 변형 >(타입)
		P25~26 P29 
		
		
		byte  b;
		char  ch;
		int  i;
		long l;
		b = 10;
		ch = 'A';
		i = 100;
		l = 1000L;
		
		b = (byte)i;
		ch = (char)b;
		s = (short)ch;
		f = (float)l;
		i = (int)ch;
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
	
		
	
	}
}
