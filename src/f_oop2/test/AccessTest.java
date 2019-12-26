package f_oop2.test;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar);
//		am.protectedMethod();
		
//		System.out.println(am.defaultVar);
//		am.defaultMethod();
		
//		System.out.println(am.privateVar);
//		am.privateMethod();*/
		
		AccessTest at = new AccessTest();  //객체생성 필요
		System.out.println(at.protectedVar);  //인스턴스 변수
		at.protectedMethod();  //인스턴스 메서드
	}

}
