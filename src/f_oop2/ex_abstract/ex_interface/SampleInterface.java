package f_oop2.ex_abstract.ex_interface;

public interface SampleInterface {
	/*
	 * << 인터페이스 >>
	 * -상수와 추상메서드만 멤버로 가질 수 있는 데이터 구조이다
	 * -interface 인터페이스명{}
	 * -모든 멤버변수의 제어자는 public static final이며, 생략가능
	 * -모든 메서드의 제어자는 public abstract이며, 생략가능
	 */
	
	public static final int NUM1 = 1;
	
	int NUM2 = 2;  //public static final 생략가능
			
	public abstract void method1();
	
	void method2();
	
	//JDK1.8부터 static메서드와  default메서드를 사용할 수 있게 되었다

}

//인터페이스는 메서드에 내용이 없기 때문에 메서드명이 중복되어도 구분할 필요가 없다
//그러므로 다중상속이 가능하다
class SampleImplement implements SampleInterface, SampleInterface2{

	@Override
	public void method1() {
		System.out.println(NUM1);
		
	}

	@Override
	public void method2() {
		System.out.println(SampleImplement.NUM2);
		
	}

	@Override
	public void method3() {
				
	}
	
}

interface SampleInterface2{
	void method1();
	void method3();
	
	
	
}




