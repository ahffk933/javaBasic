package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * put()	: 지정된 키와 값을 저장
		 * get()	: 지정된 키의 값을 반환(없으면  null)
		 * remove()	: 지정된 키로 저장된 값을 제거
		 * keySet()	: 저장된 모든 키를 Set으로 반환
		 */
		
		//arrayList에 several hashmap이 저장
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("title", "제목쓰");
		map.put("content", "내용쓰");
		map.put("user", "구한나");
		map.put("date", "2019-12-18 3:45");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		map.put("user", "lulu");
		System.out.println(map.get("user"));
		
		map.remove("user");
		System.out.println(map.get("user"));
		
		//map에 저장된 모든 내용 출력
		Set<String> keys = map.keySet();
		for(String key : keys){
			String value = map.get(key);
			System.out.println(key + " : " + value);
			
		}
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("lprod_id", 1);
		hm.put("lprod_gu", "p101");
		hm.put("lprod_nm", "컴퓨터제품");
		list.add(hm);
		
		hm = new HashMap<>();
		hm.put("lprod_id", 2);
		hm.put("lprod_gu", "p102");
		hm.put("lprod_nm", "전자제품");
		list.add(hm);
		
		hm = new HashMap<>();
		hm.put("lprod_id", 3);
		hm.put("lprod_gu", "p201");
		hm.put("lprod_nm", "여성캐주얼");
		list.add(hm);
		
		hm = new HashMap<>();
		hm.put("lprod_id", 4);
		hm.put("lprod_gu", "202");
		hm.put("lprod_nm", "남성캐주얼");
		list.add(hm);
		
		hm = new HashMap<>();
		hm.put("lprod_id", 5);
		hm.put("lprod_gu", "p301");
		hm.put("lprod_nm", "피혁잡화");
		list.add(hm);
		
		hm = new HashMap<>();
		hm.put("lprod_id", 6);
		hm.put("lprod_gu", "p302");
		hm.put("lprod_nm", "화장품");
		list.add(hm);
		
		hm = new HashMap<>();
		hm.put("lprod_id", 7);
		hm.put("lprod_gu", "p401");
		hm.put("lprod_nm", "음반/CD");
		list.add(hm);
		
		hm = new HashMap<>();
		hm.put("lprod_id", 8);
		hm.put("lprod_gu", "p402");
		hm.put("lprod_nm", "도서");
		list.add(hm);
		
		hm = new HashMap<>();
		hm.put("lprod_id", 9);
		hm.put("lprod_gu", "p403");
		hm.put("lprod_nm", "문구류");
		list.add(hm);
		
		//set key
		for(String key : list.get(0).keySet()){
			System.out.print(key + "\t");
		}
		System.out.println();
		for(int i = 0; i < list.size(); i++){
			HashMap<String,Object> hashMap = list.get(i);
			Set<String> keyset = hashMap.keySet();
			for(String Key : keyset){
				System.out.print(hashMap.get(Key) + "\t\t");
				
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
