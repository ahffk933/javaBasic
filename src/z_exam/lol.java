package z_exam;

import java.util.Scanner;

public class lol {

	public static void main(String[] args) {
//		돌려돌려 자바판
		Scanner sc = new Scanner(System.in);

		String [] name = {"", "", "", "", ""};							//5
		String [] line = {"미드", "탑", "서폿", "정글", "원딜"};				//5
		String [] summoner = {"고스트", "힐", "총명", "텔포", "강타", "보호막", "점화", "탈진", "점멸"};				//9
		String [] top = {"가렌", "모데카이저", "오른", "다리우스", "피오라", "레넥톤", "클레드", "아칼리", "블라디미르", "퀸"};			//9
		String [] mid = {"카시오페아", "피즈", "카사딘", "야스오", "녹턴", "아리", "탈론", "아우렐리온 솔", "블라디미르", "제드"};
		String [] jung ={"올라프", "에코", "엘리스", "리신", "샤코", "자크", "문도", "렉사이", "니달리", "자르반"};
		String [] adc = {"미스포춘", "세나", "애쉬", "케이틀린", "베인", "카이사","징크스", "루시안","자야", "이즈리얼"};
		String [] sup = {"레오나", "세나", "블리츠크랭크", "노틸러스", "쓰레쉬", "모르가나","잔나", "라칸", "파이크", "럭스"};
		
		/*
		 "ㅇㅇㅇ는 미드라인으로 가세요 , 미드라이너는 카시오페아가 선택되었습니다 , 미드라이너는 고스트와 힐을 들고가세요 " 
		 */
		
		
		
		for(int i = 0 ; i < name.length ; i++){
			System.out.printf("Player %d번을 입력하세요 >>> \n", i+1);
			name[i] = sc.nextLine();
		}
		
		int num =0;
		

		for(int i = 0; i<line.length; i++){	//0~4
			num = (int)(Math.random() * line.length);
			String temp = line[0];
			line[0] = line[num];
			line[num] = temp;
		}
		
		lol lol = new lol();
		for(int i = 0 ;i < line.length ; i++){
			System.out.print(name[i] + "는 ");
			System.out.println(line[i] + "라인으로 ㄱㄱ");
			
			switch(line[i]){
				case "미드" : lol.mid(mid);
					System.out.print("미드는 " );
					break;
				case "탑" : lol.top(top);
					System.out.print("탑은 " );
					break;
				case "정글" : lol.jung(jung);
					System.out.print("정글은 " );	
					break;
				case "원딜" : lol.adc(adc);
					System.out.print("원딜은 " );
					break;
				case "서폿" : lol.sup(sup);
					System.out.print("서폿은 " );
					break;
			}
			lol.summoner(summoner);
			System.out.println();
			
		}	
		
		System.out.println("GLHF~~^*^");

	}// main end
	
	void top(String [] top){
		for(int i = 0; i < top.length; i++){
			int random = (int)(Math.random() * top.length);
			
			String temp = top[0];
			top[0] = top[random];
			top[random] = temp;
		}
			
		System.out.println("탑라인은 " + top[0] + "이 선택되었습니다.");
		
	}
	void mid(String [] mid){
		for(int i = 0; i < mid.length; i++){
			int random = (int)(Math.random() * mid.length);
			
			String temp = mid[0];
			mid[0] = mid[random];
			mid[random] = temp;
		}
			
		System.out.println("미드라인은 " + mid[0] + "이 선택되었습니다.");
		
	}
	void jung(String [] jung){
		for(int i = 0; i < jung.length; i++){
			int random = (int)(Math.random() * jung.length);
			
			String temp = jung[0];
			jung[0] = jung[random];
			jung[random] = temp;
		}
			
		System.out.println("정글라인은 " + jung[0] + "이 선택되었습니다.");
		
	}
	void adc(String [] adc){
		for(int i = 0; i < adc.length; i++){
			int random = (int)(Math.random() * adc.length);
			
			String temp = adc[0];
			adc[0] = adc[random];
			adc[random] = temp;
		}
			
		System.out.println("원딜라인은 " + adc[0] + "이 선택되었습니다.");
		
	}
	void sup(String [] sup){
		for(int i = 0; i < sup.length; i++){
			int random = (int)(Math.random() * sup.length);
			
			String temp = sup[0];
			sup[0] = sup[random];
			sup[random] = temp;
		}
			
		System.out.println("서폿라인은 " + sup[0] + "이 선택되었습니다.");
		
	}
	
	void summoner(String [] sum){
		for(int i = 0; i < sum.length; i++){
			int random = (int)(Math.random() * sum.length);
			
			String temp = sum[0];
			sum[0] = sum[random];
			sum[random] = temp;
		}
			
		System.out.println("" + sum[0]+ "," +sum[1] + "를 들고가세요.");
		System.out.println();
	}
	
	


}
