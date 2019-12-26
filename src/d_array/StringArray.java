package d_array;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		String s = new String("ABCD"); //참조형 타입을 초기화하는 방법
		String str = "ABCD"; //String class만 유일하게 이렇게 초기화 가능
		
		char[] charArray = str.toCharArray();  //문자배열을 반환해주는 메서드
		System.out.println(charArray);
		//char배열은 특별히 배열의 내용이 출력된다
		
		//String calss내부에 문자배열을 다루는 여러가지 메서드가 정의되어 있음
		
		/*
		 *  << String의 주요 메서드 >>
		 *  -equals() : 문자열의 내용이 같은지 확인한다
		 *  -length() : 문자열의 길이를 반환한다
		 *  -charAt() : 문자열에서 해당 위치에 있는 문자를 반환한다
		 *  -substring() : 문자열에서 해당 범위에 있는 문자열을 반환한다
		 *  -indexOf() : 문자열 내의 특정 문자열의 인덱스를 반환한다
		 *  -replace() : 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다
		 */
		
		for(int i = 0; i < str.length(); i++){
			System.out.println(str.charAt(i)); //charArray[i]
		}
		String revStr = ""; //str을 거꾸로 담을 변수
		//뒤에서 부터 한글자씩 가져와서 새로운 변수에 더한다 예)ABCD -> DCBA
		for(int i = str.length() -1; i >= 0; i--){
			revStr += str.charAt(i);
		}
		System.out.println(revStr);
		
		str = "0123456789";
		String sub1 = str.substring(3); //3번 인덱스부터 끝까지 잘라서 반환한다
		System.out.println(sub1);
		String sub2 = str.substring(5, 8);
		System.out.println(sub2);
		
		str = "치킨 피자 돈까스 떡볶이";
		int idx = str.indexOf("피자"); //피자의 시작 인덱스를 반환한다
		System.out.println(idx);  //3 (치0 킨1 2 피3)
		
		idx = str.indexOf("햄버거");
		System.out.println(idx);  //-1 존재하지 않는 인덱스인 경우 -1을 반환한다
		
		String[] menus = {
				"치킨 18000원",
				"피자 9900원",
				"돈까스 8000원",
				"떡볶이 500원"
		};
		
		for(String menu : menus){
			String name = menu.substring(0, menu.indexOf(" "));
			System.out.println(name);
			
			//가격만 분리시켜 int형 변수에 담아라
			int price = Integer.parseInt
					(menu.substring(menu.indexOf(" ") + 1, menu.indexOf("원"))); //공백 다음 숫자가 알고싶은거니까 +1이래,,;
			System.out.println(price);
			}
		
		
		str = "123456789";
		str = str.replace("3", "짝");
		System.out.println(str);
		str = str.replace("6", "짝");
		System.out.println(str);
		str = str.replace("9", "짝");
		System.out.println(str);
		
		String pn = "010-5464-4567";
		//하이픈(-)을 제거해서 출력하라 ->01054644567
		pn= pn.replace("-", ""); //(-)의갯수에 상관없이 전부 바꿔준다 지니어스~
		System.out.println(pn);
		
/*		숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코
		드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되
		어야 한다.
*/		
		String str1 = "12345";
		int sum = 0;
		for(int x=0; x < str1.length(); x++) {
			sum += str1.charAt(x) - '0';
			
				
		}
			System.out.println("sum="+sum);
			/*			[실행결과]
			15
			
*/		
			String value = "12o34";
			char ch = ' ';
			boolean isNumber = true;
			for(int ii=0; ii < value.length() ;ii++) {
				ch = value.charAt(ii);
				if(! (ch >='0' && ch <= '9')){
					isNumber = false;
			}
			
			
			
			}if (isNumber) {
				System.out.println(value+"는 숫자입니다.");
				} else {
				System.out.println(value+"는 숫자가 아닙니다.");
				}
			//숫자를 입력받아 입력받은 숫자 3자리 마다 콤마(,)를 붙여라
			//123456789 -> 123,456,789
			//12345 -> 12,345
			//1234 -> 1,234
			//끝에서 부터 네번째자리에 ','
			String num = "123456789";
			String tmp1 = "";
			String tmp2 = num;
			for(int a = num.length()-3; a >0 ;a=a-3){
				tmp1 = "," +num.substring(a, a+3) + tmp1;
				tmp2 = num.substring(0,a);
				
			}
			System.out.println(tmp2  + tmp1); //마지막 자리까지 나오게 하려면 t2+t1 if t1 + t2하면 456,789,123 이렇게 나옴
			
				
			
			Scanner sc = new Scanner(system.in);
				System.out.println("숫자를 입력하시오");
				String number = sc.nextLine();
				String newNumber = "";
				
				int count = 0;
				
				for(int i = number.length() -1; i >= 0; i--){
					newNumber = number.charAt(i) + newNumber;
					count++;
					if(count %3 == 0 && count != number.length()){
						newNumber = "," + newNumber;
					}
				}
				System.out.println(newNumber);
				
			}
			
			
		}
	
		
		
		
		
		
		
		
		

	


