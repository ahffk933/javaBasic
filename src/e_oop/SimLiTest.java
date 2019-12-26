package e_oop;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		new SimLiTest().q1();

	}
		
	
	Scanner sc = new Scanner(System.in);
	
	void q1(){
		System.out.println("나는 금사빠?");
		String ans = sc.nextLine();
		if(ans.equals("y")){
			q2();
		}else{
			q4();
		}
		
	}
	void q2(){
		System.out.println("연애할 때 끌려다니는 타입?");
		String ans = sc.nextLine();
		if(ans.equals("y")){
			q5();
		}else{
			q3();
		}
		
	}
	void q3(){
		System.out.println("데이트 코스는 미리 짜는게 편해?");
		String ans = sc.nextLine();
		if(ans.equals("y")){
			q6();
		}else{
			q5();
		}
		
	}
	void q4(){
		System.out.println("감정기복 커?");
		String ans = sc.nextLine();
		if(ans.equals("y")){
			q7();
		}else{
			q5();
		}
		
	}
	void q5(){
		System.out.println("감정표현에 솔직하니?");
		String ans = sc.nextLine();
		if(ans.equals("y")){
			q8();
		}else{
			q6();
		}
		
	}
	void q6(){
		System.out.println("활동적인 데이트가 좋니?");
		String ans = sc.nextLine();
		if(ans.equals("y")){
			q8();
		}else{
			q9();
		}
		
	}
	void q7(){
		System.out.println("연락이 없어도 믿고 기다리는 편이니?");
		String ans = sc.nextLine();
		if(ans.equals("y")){
			System.out.println("your type is A");
		}else{
			q8();
		}
		
	}
	void q8(){
		System.out.println("이성친구는 존재하니?");
		String ans = sc.nextLine();
		if(ans.equals("y")){
			q9();
		}else{
			System.out.println("your type is B");
		}
		
	}
	void q9(){
		System.out.println("아무것도 아닌일에 쉽게 섭섭하니?");
		String ans = sc.nextLine();
		if(ans.equals("y")){
			System.out.println("your type is D");
		}else{
			System.out.println("your type is C");
		}
		
	}
	
	
	
	
	}


