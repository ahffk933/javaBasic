package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 *  << OOP(Object Oriented Programming) : 객체지향 프로그래밍 >>
		 *  -프로그래밍을 단순히 코드의 연속으로 보는것이 아니라, 객체간의 상호작용으로 보는것
		 *  -코드의 재사용성이 높고 유지보수가 용이하다
		 *  
		 *  << 객체 생성(인스턴스화) >>
		 *  -클래스를 사용하기 위해 메모리(heap영역)에 올려놓은것
		 *  -new 클래스명(); -> 객체가 저장된 메모리 주소 반환
		 *  -객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다
		 *  -객체는 생성될 때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다
		 */
		
		SampleClass sc = new SampleClass(); //메모리에 올라간 주소를 변수에 저장함 SampleClass -> sc로 저장
		
		sc.method1();
		
		sc.method2(5); //int parameter에 리터럴 5를 넣어줌
		
		String returnString = sc.method3(); //String type의 리턴타입을 불러옴
		System.out.println(returnString);
		
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);
		
		//test1() 호출시 출력되는 문장에 번호를 붙여주세여
		sc.test1();
		
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장하라
		ClassMaker cm = new ClassMaker();
		//객체가 저장된 변수를 통해 메서드들을 호출하라
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주고,
		//리턴타입이 있는 메서드는 리턴받은 값을 출력하라
		
		cm.method1();
		
		String method2 = cm.method2();
		System.out.println(method2);
//		System.out.println(cm.method2());   이렇게도 가능!
		
		cm.method3(92);
		System.out.println();
		
		int method4 = cm.method4(1,0);
		System.out.println(method4);
		
		
		//계산한 최종값을 출력하라
		/*	1. 123456 + 654321
			2. 1번 값 * 123456
			3. 2번 값 / 123456
			4. 3번 값 - 654321
			5. 4번 값 % 123456
		*/
		Calculator cc = new Calculator();
		
		double method1 = cc.method1(123456, 654321);
		System.out.println(method1);
		
		double method3 = cc.method3 (method1,123456);
		System.out.println(method3);
		
		double method6 = cc.method6 (method3, 123456);
		System.out.println(method6);
		
		double method7 = cc.method7(method6, 654321);
		System.out.println(method7);
		
		double method5 = cc.method5(method7, 123456);
		System.out.println(method5);
		
		

	}

}
