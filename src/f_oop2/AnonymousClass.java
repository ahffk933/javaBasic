package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {

	public static void main(String[] args) {
		//익명 클래스 : 하나의 부모 클래스나 인터페이스를 상속받아 클래스를 선언함과 동시에 객체를 생성하는 클래스 
		//(no이름)(사용처가 정해짐/ 딱 정해진곳에서만 사용)
		Button b = new Button();
		
		b.addActionListener(new ActionListener(){
			//ActionListener를 상속받은 자식 클래스

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 누르면 실행");
				
			}
			
		});  //액션리스너 뒤 중괄호부터 요앞 중괄호까지

	}
//그래픽유저 인터페이스 만들때 주로 사용 GUI
}
