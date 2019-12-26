package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 *  우리반 모두의 Java, Orecle, HTML, CSS JQuery, JSP 점수를
		 *  50~100까지 랜덤으로 생성시켜주고,
		 *  석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력하라
		 *  
		 *  순위  이름   Java Oracle HTML CSS JQuery JSP  총첨    평균
		 *  1   홍길동   90	 100   80   50   30    90  400  70
		 *  2   홍길동   90	 100   80   50   30    90  400  70
		 *  3   홍길동   90	 100   80   50   30    90  400  70
		 *  4   홍길동   90	 100   80   50   30    90  400  70
		 *  5   홍길동   90	 100   80   50   30    90  400  70
		 */
		
	/*	String [] name = { "박진영", "정보람", "민태홍", "이승재", "이예림", "이누리", "박종민",
							"이지형", "김경운", "강현지", "이병훈", "백종빈", "정재영", "정대석",
							"구한나", "김령환", "연은주", "윤창훈", "주향한", "강현철", "김지선" };
		String [] sub = { "Java", "Oracle", "HTML", "CSS", "JQuery", "JSP" };
	
		
		int java = 0, Oracle = 0, HTML = 0, CSS = 0, JQuery = 0, JSP = 0;
		System.out.println("석차\t" + "이름\t" + "Java\t" + "Oracle\t" + "HTML\t" + "CSS\t" + "JQuery\t" + "JSP\t" + "총점\t" + "평균");
		
		
	
			
		int[][] score = new int [name.length][sub.length];
		int[] sum = new int [name.length];
		double[] avg = new double[name.length]; 
		int rank[] = new int [name.length];
		
		for(int i =0; i < score.length; i++){
			for(int j = 0; j < score[i].length; j++){
				score[i][j] = (int)(Math.random()* (100-50+1) + 50);
				sum[i] += score[i][j];
			}
			java += score[i][0];
			Oracle += score[i][1];
			HTML += score[i][2];
			CSS += score[i][3];
			JQuery += score[i][4];
			JSP += score[i][5];
			avg[i] = (int)(sum[i] / score[i].length * 100000) / 100000;
			
			
		}
		
		for(int i= 0; i < name.length; i++){
			rank [i]=1;
			for (int j =0; j < name.length; j++){
				if(sum[i]<sum[j]){
					rank[i]++;
				}
			}
				
		}
		
		
		for(int i = 0; i < rank.length; i++){  //i는 고정되어있고, j가 계속 움직이는 애
			boolean changed = false;
			for(int j = 0; j < rank.length-1-i; j++){  //한바퀴 돌때마다 
				if(rank[j] > rank[j +1 ]){   //0과 1비교, 1과 2비교...그래서 +1
					int temp = rank[j];
					rank[j] = rank[j+1];
					rank[j+1] = temp;
					
					int temp2 = sum[j];
					sum[j] = sum[j+1];
					sum[j+1] = temp2;
					
					String temp3 = name[j];
					name[j] = name[j+1];
					name[j+1] = temp3;
					
					int temp4[]= score[j];
					score[j] = score[j+1];
					score[j+1] = temp4;
					
					double temp5= avg[j];
					avg[j] = avg[j+1];
					avg[j+1] = temp5;
					
					
					changed = true;
				}
			}
			if(!changed){
				break;
			}
		}
		
		
			
		for(int i =0; i < score.length; i++){
			System.out.print(rank[i]+ "\t" + name[i] + "\t");
			for(int j = 0; j < score[i].length; j++){
				System.out.print(score[i][j] + "\t");
				
			}
			System.out.println(sum[i] + "\t"+ avg[i]);
		
			
		}
		double savg[] = new double [sub.length];
		int []sum1  = new int[score.length];
		for(int i = 0; i < 6; i++){  //21돌고
			for(int j = 0; j < 21; j++){ //과목 6번 돌고
			sum1[i] += score[i][j];
		}
	}
			for(int i = 0; i < sub.length; i++){
				savg[i] = (double) sum1[i] /6;
			}
			System.out.print("과목별 평균 : \t" + savg[0] + "\t" +savg[1] + "\t" + savg[2] + "\t" + savg[3] + "\t" + savg[4] + "\t" + savg[5] + "\t" );
			
	*/	
		
			String[] students = {"박진영", "정보람", "민태홍", "이승재", "이예림", "이누리", "박종민",
					"이지형", "김경운", "강현지", "이병훈", "백종빈", "정재영", "정대석",
					"구한나", "김령환", "연은주", "윤창훈", "주향한", "강현철", "김지선" };
			
			String[] subjects = { "Java", "Oracle", "HTML", "CSS", "JQuery", "JSP" };
			
			double[][] scores = new double[students.length][subjects.length +3]; //석차, 총점, 평균 넣을려고 +3
			
			//점수 입력
			for(int i = 0; i < scores.length; i++){
				scores[i][0] = 1; //석차
				for(int j = 0; j < subjects.length; j++){
					scores[i][j + 1] = (int)(Math.random() * 51)+ 50;
				}
			}
			//총점 과 평균
			for(int i= 0; i < scores.length; i++){
				for(int j = 0; j < subjects.length; j++){
					scores[i][scores[i].length -2]
							+= scores[i][j + 1]; //총점
				}
				scores[i][scores[i].length - 1]
						= (int)(scores[i][scores[i].length - 2]
								/ subjects.length * 100 + 0.5)
								/ 100.0; //평균
			}
			//석차
			for(int i = 0; i < scores.length; i++){
				for(int j = 0; j < scores.length; j++){
					if(scores[i][scores[i].length - 1]
							< scores[j][scores[j].length -1]){
						scores[i][0]++;
					}
				}
			}
			
			//정렬
			for(int i=0; i < scores.length -1; i++){
				for(int j = i + 1; j < scores.length; j++){
					if(scores[i][0] > scores[j][0]){
						double[] temp = scores[i];
						scores[i] = scores[j];
						scores[j] = temp;
						
						String tempName = students[i];
						students[i] = students[j];
						students[j] = tempName;
					}
				}
			}
			
			//출력
			System.out.print("석차\t이름");

			for(int i = 0; i < subjects.length; i++){
				System.out.print("\t " + subjects[i]);
			}
			System.out.println("\t총점\t평균\t");
			
			for(int i = 0; i < scores.length; i++){
				System.out.print((int)scores[i][0] + "\t"
						+ students[i]);
				for(int j = 1; j < scores[i].length; j++){
					System.out.print("\t" + scores[i][j]);
				}
				System.out.println();
			}
			System.out.print("과목별 평균 \t");
			for(int i = 1; i <= subjects.length; i++){
				double sum= 0;
				for(int j = 0; j < scores.length; j++){
					sum += scores[j][i];
				}
				double avg = (int)(sum / scores.length * 100 + 0.5)
						/ 100.0;
				System.out.print("\t" + avg);
			}
			
			
		
	
	
			}

	}

