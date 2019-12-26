package i_collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * add() 	: 마지막 위치에 객체를 추가
		 * get() 	: 지정된 위치의 객체를 반환
		 * set() 	: 지정된 위치에 주어진 객체를 저장(수정) 인덱스 번호와 위치
		 * remove() : 지정된 위치의 객체를 제거
		 * size() 	: 저장된 객체의 수 반환 (like length)
		 */
		
		ArrayList<Object> list = new ArrayList<Object>();   //<>어떤타입 저장할건지 지정해주는거
		
		list.add(10);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());           
		
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.set(1, "456"); //index번호 지정해주고, 수정
		
		for(int i = 0; i < list2.size(); i++){
			System.out.println(list2.get(i));
		}
		list2.remove(0);
		//리스트에 저장된 값을 삭제하면 그 뒤의 모든 값의 인덱스가 당겨진다 0삭제했으니까 1번이 ->0, 2번->1
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		//2차원 배열
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
		//{{10},{10}} 이렇게 저장된거야
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(10);
		
		list3.add(list4);
		
		list4 = new ArrayList<>();
		list4.add(10);
			
		list3.add(list4);
		
		//정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 넣어라
		ArrayList<Integer> list5 = new ArrayList<>();
		list5.add(10);
		list5.add(100);
		list5.add(3);
		list5.add(30);
		list5.add(6);
		
		//위에서 만든 ArrayList에 담긴 값들의 합계와 평균을 출력하여라
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < list5.size(); i++){
			sum += list5.get(i);
			avg = sum/list5.size();
			
		}
		System.out.println(sum);
		System.out.println(avg);
		
		//위에서 만든 ArrayList에 담긴 값들 중 최소값과 최대값을 출력하라
		int min = list5.get(0);
		int max = list5.get(0);
		for(int i = 0; i < list5.size(); i++){
			if(list5.get(i) < min){
				min = list5.get(i);
				
			}if(max < list5.get(i)){
				max = list5.get(i);
		}
	}
		System.out.println(min);
		System.out.println(max);
		
		//위에서 만든 ArrayList의 값을 내림차순으로 정렬하라
		for(int i = 0; i < list5.size(); i++){
			for(int j = 0; j < list5.size(); j++){
				if(list5.get(i) > list5.get(j)){
					int temp = list5.get(i);
					list5.set(i, list5.get(j));
					list5.set(j, temp);
				}
				
			}
		}System.out.println(list5);
		
				
		Collections.sort(list5);
		System.out.println(list5);
		Collections.reverse(list5);
		System.out.println(list5);
		
		
	

	}

}
