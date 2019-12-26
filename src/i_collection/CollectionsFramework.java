package i_collection;

import java.util.ArrayList;

public class CollectionsFramework {

	public static void main(String[] args) {
		/*
		 * << CollectionsFramework >>
		 * -Collections : 다수의 데이터
		 * -Framework 	: 표준화된 프로그래밍 방식
		 * 
		 * << List >> interface
		 * - Vector     : ArreyList의 구버전
		 * - ArrayList  : 저장 순서 유지, 중복 허용   *** //쓰거나 수정 속도 빠름
		 * - LinkedList : 데이터 추가 및 삭제시간 단축  //읽는 속도 빠름
		 * - Stack      : LIFO(Last In First Out)
		 * - Queue 		: FIFO(First In First Out)
		 * 상속받은 애들 ^^^^
		 * 
		 *  << Set >>
		 *  - HastSet : 중복 허용 안함, 저장순서 유지 안함
		 *  - TreeSet : 정렬, 검색기능 향상
		 *  
		 *  << Map >>
		 *  - HasgTable : HashMap의 구버전
		 *  - HashMap : '키'(key)와 값(value)을 한쌍으로 저장 *
		 *  - TreeMap : 정렬, 검색기능 향상
		 */
		ArrayList<Object> subject = new ArrayList<>();
		subject.add("Java");
		subject.add("Oracle");
		subject.add("HTML");
		subject.add("CSS");
		subject.add("JQuery");
		subject.add("JSP");
				
		
		ArrayList<String> students = new ArrayList<>();
		
		students.add("김지선");
		students.add("이누리");
		// students.add("정대석");
		// students.add("박종민");
		// students.add("정재영");
		// students.add("강현철");
		// students.add("주향한");
		// students.add("윤창훈");
		// students.add("연은주");
		// students.add("김령환");
		// students.add("구한나");
		// students.add("백종빈");
		// students.add("이병훈");
		// students.add("강현지");
		// students.add("김경운");
		// students.add("이지형");
		// students.add("이예림");
		// students.add("이승재");
		// students.add("민태홍");
		// students.add("정보람");
		// students.add("박진영");

		ArrayList<ArrayList<Double>> list = new ArrayList<>();  //전부 다 넣을거임
		
		//점수 입력
		for(int i = 0; i < students.size(); i++){
		
			ArrayList<Double> score = new ArrayList<>();
			
			score.add(1.0);  //석차 부터 출력할거니까 첫번째
			
			for(int j = 0; j < subject.size(); j++){      //과목사이즈만큼 돌려
				score.add((double)getRandom(50, 100));
			}
			list.add(score);     //리스트에 넣어보리기~  학생 수 만큼 점수가 ++
		}
		//총점과 평균
		for(int i = 0; i < list.size(/*인원*/); i++){
			
			ArrayList<Double> score = list.get(i);  //list(score(점수들))
			int sum = 0;
			for(int j = 1; j < score.size(/*과목별*/); j++){  // j=0값 석차 1번인 인덱스 java부터 for문은 돌아간다
				sum+= score.get(j);
			}
			score.add((double)sum);  //총점
			score.add((double)sum / subject.size()); //평균
		}
		
		//순위  점수가 돌아가다가 더 높은 점수 만나면 올라감
		for(int i =0; i < list.size(); i++){
			for(int j =0; j < list.size(); j++){
				if(list.get(i).get(subject.size() + 1)  // <-총점임
						< list.get(j).get(subject.size()+ 1)){ //i총점과 j총점 비교
					list.get(i).set(0,  list.get(i).get(0) + 1);  //0인덱스가 순위 에다가 +1증가
				}
						}
		}
		//순위대로 정렬 //버블정렬쓰
		for(int i = 0; i < list.size() -1; i++){
			boolean changed = false;
			
			for(int j = 0; j < list.size()-1 -i; j++){
				if(list.get(j).get(0) > list.get(j+1).get(0)){  //점수와 이름을 같이 정렬
					ArrayList<Double> temp = list.get(j);
					list.set(j,  list.get(j+1));
					list.set(j + 1,  temp);
					
					String tempName = (String) students.get(j);
					students.set(j, students.get(j+1));
					students.set(j + 1, tempName);
					
					changed =true;
				}
			}
			if(!changed) break;
		}
		//출력
		System.out.print("석차\t이름");
		for(int i = 0; i < subject.size(); i++){
			System.out.print("\t" + subject.get(i));
		}
		System.out.println("\t총점 \t 평균");
		for(int i = 0; i < list.size(); i++){
			ArrayList<Double> score = list.get(i);
			for(int j = 0; j < score.size(); j++){
				System.out.print((int)((double)score.get(j)) + "\t");
			if(j==0){
				System.out.print(students.get(i)+ "\t");
			}
			}
			System.out.println();
		}
		
	}
	static int getRandom(int from, int to){
		return (int)(Math.random() * (Math.abs(to - from) +1))
				+ Math.min(from, to);
	}

}
