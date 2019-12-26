package e_oop; //현재 클래스의 위치를 알려준다

import java.util.*; //다른 패키지에 있는 클래스의 위치를 알려준다 // *은 모든 package를 사용할 수 있음
						  //import는 package와 public class사이에 와야함

public class SampleClass {
	
	int field = 10; //전역변수 : 클래스 전체 영역에서 공유하는 변수
	
	/*
	 * - 메서드 : 코드를 분리해서 더 효율적인 프로그램을 만들기 위한 도구
	 * - 리턴타입 메서드명(파라미터){}
	 * - 리턴타입(반환타입) : 실행 후 돌려줘야하는 결과물 //하나만 받을 수 있
	 * - 파라미터(매개변수) : 실행에 필요한 정보 //여러개 보낼 수 있
	 */
	
	void method1(){  //void가 리턴타입 ()가 파라미터 값을 지정해주지 않음
		System.out.println("파라미터도 리턴타입도 없는 메서드");
	}
	void method2(int parameter){  //(int parameter는 지역변수처럼 여기서만 사용가능
		System.out.println(parameter + "를 사용해 명령을 수행하는 메서드");
	}
	String method3(){
		return "명령 수행 후 결과물을 돌려주는 메서드";
		//return : 메서드를 종료시키고 결과물을 돌려준다
		//리턴타입이 없는 메서드에서는 메서드를 종료시킨다 (타입만 적어주면됨 like(String))
		}
	
	int method4(int a, int b){
		System.out.println(a + "," + b + "를 사용해 명령을 수행하고 결과물을 돌려주는 메서드");
		return a + b;
	}
	
	void test1(){
		System.out.println("test1 시작"); //1
		test3();
		System.out.println("test1 종료"); //6
	}
	void test2(){
		System.out.println("test2시작"); //3
		System.out.println("test2종료"); //4
	}
	void test3(){
		System.out.println("test3시작"); //2
		test2();
		System.out.println("test3종료"); //5	}
	

	



}
}

	