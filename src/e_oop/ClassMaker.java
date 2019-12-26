package e_oop;

public class ClassMaker {
	
	//전역변수 하나를 선언 및 초기화 한다
	String name = "luxzzang";
	
	//리턴타입과 파라미터가 없는 메서드 하나를 만들어라
	//메서드 안에서 전역변수를 출력하라
	void method1(){
		System.out.println(name);

	}
	//전역변수와 동일한 타입의 리턴타입이 있고 파라미터가 없는 메서드 하나를 만들어라
	//메서드 안에서 전역변수를 리턴하라
	String method2(){
		return name;
		
	}
	//리턴타입은 없고 파라미터가 하나 있는 메서드를 만들어라
	//메서드 안에서 파라미터를 출력하라
	void method3(int lol){
		System.out.println(lol);
		
	}
	
	//int타입의 리턴타입과 int타입의 파라미터 두개가 있는 메서드 하나를 만들어라
	//메서드 안에서 두 파라미터를 곱한 결과를 리턴하라
	int method4(int i, int u){
		return i * u;
	}

}
