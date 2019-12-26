package z_exam;

import java.util.Arrays;
import java.util.Scanner;

public class memo4 {

	public static void main(String[] args) {

		/*
		 * for(int i=0; i<=10; i++) { for(int j=0; j<=i; j++)
		 * System.out.print("*"); System.out.println();
		 */

	/*	int i = 0;
		
		while (i <= 10) {
			int j = 0;
			while (j <= i) {

				System.out.print("*");
				j++;
				
			}
			System.out.println();
			i++;
		}
	//	두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
	//	로그램을 작성하시오.
	//	

		
		for( int a = 1; a <=6; a++){
			for(int b = 1; b<= 6; b++){
				if(a+b ==6)
					System.out.println(a+ " "+b);
			}
			
		}*/
		
/*	int num = 12345;
	int sum = 0;
	while(num>)
			
		}
	}
*/ //1~10사이에 난수를 500번 생성하고 각 숫자가 생성된 횟수를 출력
	
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
		
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++)
			System.out.print("*");
			System.out.println();
			}
		int i=0;
		while(i <= 10){
			int j = 0;
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		while(i >= 10){
			int j =0;
		
			while (j>=i){
				System.out.print("*");
				j--;
			}
			System.out.println();
			i--;
		}
		
		
		
		
		
		
	}



public static void main(String[] args){
	for(int i = 0; i < 10; i++){
		for(int j=0; j < 10; j++){
			System.out.print(" ");
		}
		for(int j = 0; j < i * 2 +1; j++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
}	