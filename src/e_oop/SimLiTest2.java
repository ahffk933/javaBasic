package e_oop;

import java.util.Scanner;

public class SimLiTest2 {

	public static void main(String[] args) {
		new SimLiTest().q1();

	}
	String[] questions = {
			"나는 금사빠?(y/n)",
			"연애할 때 끌려다니는 타입?(y/n)",
			"데이트코스는 미리 짜는게 편하니? (y/n)",
			"감정기복이 크지 않니? (y/n)",
			"감정 표현에 솔직한 편이니? (y/n)",
			"활동적인 데이트가 좋니? (y/n)",
			"연락이 없어도 믿고 기다리는 편이니? (y/n)",
			"이성친구는 존재할 수 없니? (y/n)",
			"아무것도 아닌일에 쉽게 섭섭하니? (y/n)"
	};
	
	String[] results = { "서로에 대한 신회감이 깊고 존중해주는 어른스러운 연애를 하는 A type",
						"구속을 하는것도, 받는 것도 싫은 자유로운 연애를 하는 B타입",	
						"이것은 의리인가 사랑인가 친구같이 편안한 연애를 하는 C타입",
						"무조건 잘해주고 무조건 맞춰주는 다 퍼주는 연애를 하는 D타입"};
	
	Scanner sc = new Scanner(System.in);
	
	
	
	
	void q1(){
		System.out.println(questions[0]);
		String ans = sc.nextLine();
		if(ans.equals("yes")){
			q2();
		}else{
			q4();
		}
	}
	void q2(){
		System.out.println(questions[1]);
		String ans = sc.nextLine();
		if(ans.equals("yes")){
			q5();
		}else{
			q3();
		}
	}	
	void q3(){
		System.out.println(questions[2]);
		String ans = sc.nextLine();
		if(ans.equals("yes")){
			q6();
		}else{
			q5();
		}
	}
	
		void q4(){
			System.out.println(questions[3]);
			String ans = sc.nextLine();
			if(ans.equals("yes")){
				q7();
			}else{
				q5();
			}
		}
		void q5(){
			System.out.println(questions[4]);
			String ans = sc.nextLine();
			if(ans.equals("yes")){
				q8();
			}else{
				q6();
			}
		}
		void q6(){
			System.out.println(questions[5]);
			String ans = sc.nextLine();
			if(ans.equals("yes")){
				q8();
			}else{
				q9();
			}
		}
		void q7(){
			System.out.println(questions[6]);
			String ans = sc.nextLine();
			if(ans.equals("yes")){
				type_A();
			}else{
				q8();
			}
		}
		void q8(){
			System.out.println(questions[7]);
			String ans = sc.nextLine();
			if(ans.equals("yes")){
				q9();
			}else{
				type_B();
			}
		}
		void q9(){
			System.out.println(questions[8]);
			String ans = sc.nextLine();
			if(ans.equals("yes")){
				type_D();
			}else{
				type_C();
			}
		}
		void type_A(){
			System.out.println(results[0]);
		}
		void type_B(){
			System.out.println(results[1]);
		}
		void type_C(){
			System.out.println(results[2]);
		}
		void type_D(){
			System.out.println(results[3]);
		}
		
		
		
		
		
		
	}

