package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 *  << 배열 >>
		 *  -int[] number = new int[5]; //기본값으로 초기화한다 //[]안에 값의 크기 지정
		 *  -int[] number = new int[]{10, 20, 30, 40, 50};
		 *  -int[] number = {10, 20, 30, 40, 50}; 
		 */
		
		//배열은 참조형 타입!!(주소를 저장)
		int[] array; //배열의 주소를 저장할 공간 생성
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다
		//new : 새로운 저장공간 생성 및 주고 반환
		//int[5] : int타입을 저장할 수 있는 5개의 공간
		//배열 초기화 시 기본값이 저장된다
		
		System.out.println(array);
		
		System.out.println(array[0]);
		//실제 값에 접근하기 위해 index를 지정해줘야 한다
		//index에는 int type만 사용할 수 있다([요안에]리터럴, 변수, 상수, 연산 등)
		
		String arrayStr = Arrays.toString(array);
		//배열의 모든 인덱스에 저장된 값을 문자열로 반환한다
		System.out.println(arrayStr);
		
		int[] iArray1 = new int[]{1, 2, 3};
		//값의 개수로 배열의 길이가 정해진다
		int[] iArray2 = {1, 2, 3}; //선언과 초기화를 동시에 해야한다
		//예 : int[] iArray3;
		//	  iArray3 = {1, 2, 3}; //컴파일 에러 발생
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50; //마지막 인덱스는 "배열의 길이 -1"
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 하라
		int[] iArray3 = new int[10]; //int의 기본값 0이 10개가 저장
		
		//모든 인덱스에 있는 값을 변경하라
		int[] iArray4 = new int[5];
		iArray4[0] = 10;
		iArray4[1] = 20;
		iArray4[2] = 30;
		iArray4[3] = 40;
		iArray4[4] = 50;
		
		//모든 인덱스에 있는 값의 합계를 출력하라
		int sum = 0;
		sum += iArray4[0]; 
		sum += iArray4[1];
		sum += iArray4[2];
		sum += iArray4[3];
		sum += iArray4[4];
		
		System.out.println(sum);
		
		//index는 1씩 증가하는 규칙이 있어 for문과 함께 사용하기 좋다
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		//배열의 길이를 알고있다고 숫자를 사용하는 것을 "하드코딩"이라고 한다(자제)
		//길이를 알더라도 "length를 사용"하는 것이 더 좋은 코드이다
		
		
		for(int i = 0; i < array.length; i++){
			array[i] = i + 1;
		}
		System.out.println(Arrays.toString(array));
		
		
		//배열에 숫자를 담고 합계와 평균을 구하라
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random() *100) +1;
		}
		System.out.println(Arrays.toString(numbers));
		
		sum = 0;
		double avg = 0;
		for(int i = 0; i < numbers.length; i++){
			sum += numbers[i];
		}
		avg = (double)sum / numbers.length;
		System.out.println("합계: " + sum + " / 평균 : " + avg);
		
		//향상된 for문
		for(int number : numbers){ //배열에 있는 값을 차례대로 변수에 넣는다(값을 저장할 수는 x 변수에 들어있는 값만 바뀔뿐)
			System.out.println(number);
			
		
		}
		//배열에 저장된 숫자들 중 최소값과 최대값을 찾아라
		int[] nms = new int[10];
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random() *100) +1;
		}
		System.out.println(Arrays.toString(nms));
		int min = numbers[0];
		int max = numbers[0];
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] < min){
				min = numbers [i];
			}else if(max <= numbers[i]){
				max = numbers[i];
			
			
		}System.out.println("min num is : " + min+ "max num is: " + max);
		

		
		
	}
		int[] shuffle = new int[30];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//배열의 값을 섞어라
		//0번 인덱스의 값과 랜덤 인덱스의 값을 서로 교환하라
		for(int i = 0; i < shuffle.length * 10; i++){
			int random = (int)(Math.random() * shuffle.length);
			int temp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = temp;
		
		
		}System.out.println(Arrays.toString(shuffle));
		
		//1~10사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력하라
		
int[]num= new int[10];
		
		for (int x=0; x<=500; x++){
		int random = (int)(Math.random()* 10)+1;
			/*if(random==1)num[0]++;
			if(random==2)num[1]++;
			if(random==3)num[2]++;
			if(random==4)num[3]++;
			if(random==5)num[4]++;
			if(random==6)num[5]++;
			if(random==7)num[6]++;
			if(random==8)num[7]++;
			if(random==9)num[8]++;
			if(random==10)num[9]++;*/
			num[random-1]++; 
			
				
		}System.out.println(Arrays.toString(num));
		
		선택
		삽입
		
			
		}
		
		
		
		
		
		
	
		

}

