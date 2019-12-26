package f_oop2;


//싱글톤 패턴 : '객체의 생성을 제한'하여 '하나의 객체만' 사용하게 하는 디자인 패턴
//객체들 간에 객체를 공유하기 위해 사용한다
public final class Singleton {  //final붙으면 상속받을 수 없슴
	
	private static Singleton instance;   //클래스 변수 instance
	
	//생성자의 접근제어자를 private으로 만들어 다른 클래스에서 객체생성하는 것을 막는다
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){  //맨 첨 값이 null일때 한번만 객체 생성해줌
			instance = new Singleton();  //그걸 빌려주는거임 : 싱글톤 패턴
		}
		return instance;
	}

}
