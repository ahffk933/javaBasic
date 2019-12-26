package f_oop2.ex_abstract;

public abstract class SampleAbstractParent {
	
	/*
	 *  << 추상메서드 >>
	 *  -구현부(내용)가 없이 '선언부만 존재'하는 메서드이다
	 *  -abstract 리턴타입 메서드명() //중괄호없이 ; 로 끝남
	 *  -클래스 구현에 도움을 주기 위해 사용한다
	 *  
	 *  << 추상클래스 >>
	 *  -추상메서드를 가진 클래스를 추상클래스라고 한다
	 *  -abstract class 클래스명{}
	 *  -추상클래스는 '객체를 생성할 수 없고', '부모 클래스의 역할만'할 수 있다
	 *  -반드시 오버라이딩해서 내용(구현)을 만들어줘야함
	 */
	
	
	void method(){
		
	}
	
	//추상메서드
	abstract void abstractMethod();   //부모역할 클래스
	

}

class SampleAbstractChild extends SampleAbstractParent{
	
	//추상메서드를 상속받으면 반드시 구현해야한다
	//상속받은 추상메서드를 추상메서드로 남겨두려면 클래스를 추상클래스로 변경해야 한다
	@Override
	void abstractMethod() {
		
		
	}
	
}
