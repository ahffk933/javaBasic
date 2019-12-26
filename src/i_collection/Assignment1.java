package i_collection;

import java.util.ArrayList;

public class Assignment1 {

	public static void main(String[] args) {
		ArrayList<Object> students = new ArrayList<Object>();
		
		students.add("김지선");
		students.add("이누리");
		students.add("정대석");
		students.add("박종민");
		students.add("정재영");
		students.add("강현철");
		students.add("주향한");
		students.add("윤창훈");
		students.add("연은주");
		students.add("김령환");
		students.add("구한나");
		students.add("백종빈");
		students.add("이병훈");
		students.add("강현지");
		students.add("김경운");
		students.add("이지형");
		students.add("이예림");
		students.add("이승재");
		students.add("민태홍");
		students.add("정보람");
		students.add("박진영");
		
		ArrayList<Object> subject = new ArrayList<Object>();
		subject.add("Java");
		subject.add("Oracle");
		subject.add("HTML");
		subject.add("CSS");
		subject.add("JQuery");
		subject.add("JSP");
		//점수
		ArrayList<Integer> score = new ArrayList<Integer>();
		for(int i = 0; i < score.size(); i++){
			ArrayList<ArrayList<Integer>> scoreList = new ArrayList<>();
			for(int j = 0; j < score.size(); j++){
				score.add((int)(Math.random()*51)+50);
			}
								
		//합계와 평균	
		}ArrayList<Integer> sum = new ArrayList<Integer>();
	
		int total = 0;
		double avg;
		for(int i =0; i < sum.size(); i++){
			total = total + sum.get(i);
		}
		avg = total / sum.size();
	
		
		ArrayList<Integer> rank = new ArrayList<Integer>();
		for (int i = 0; i < students.size(); i++){
			rank(i) = 1;
		}
		
			
		
				

	}

}
