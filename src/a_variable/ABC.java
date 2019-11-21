package a_variable;
//주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용한다.)
//한줄 주석 : ctrl + shift + c
/* 범위주석  : ctrl + shift + /(해제:\)*/

//클래스(class) : 데이터와 처리내용의 집합
//사용하고 싶은 클래스, 데이터, 처리내용 등이 있는 경우 선언을 통해 의사표현을 해야한다.
//선언 : 사용하고자 하는 것의 종류와 이름을 컴퓨터에게 알려주는 것.
public class ABC {
	// {} : 블럭(내용의 범위)
	
	//변수 : 데이터
	int cariable; //;(세미콜론) : 문장의 마침표
	
	//메서드(method) : 기능(처리)
	//main method : 프로그램의 시작과 끝
	public static void main(String[] args) {
		//블럭이 시작되면 Tab(탭) 1칸으로 계층 표현(계층을 쉽게 구분하기 위해)
		//코드는 기본적으로 위에서 아래로 왼쪽에서 오른쪽으로 실행
		//실행할 문장을 메서드 안에 넣는다.
		System.out.println("Hello"); //괄호안에 있는 내용을 콘솔창에출력하는 메서드
		System.out.print("Hello"); //줄바꿈을 하지 않음 (ln:line)
		//코딩 : 코드를 작성하는 것
		//main method의 마지막 문장까지 수행되면 프로그램은 종료됨
		
		//예약어(키워드) : 자바에서 사용하는 특별한 의미와 기능을 가진 단어
		
		//코드는 영문을 사용하기 때문에 영타연습이 필요. 최소 200타 이상
	}

}
