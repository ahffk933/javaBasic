package c_statement;

import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		//숫자 야구게임을 만들어라
		Scanner s = new Scanner(System.in);
		int ball = 0, strike = 0, out = 0;
		int x;
		int y;
		int z;
		do{
			
			x=(int)(Math.random()*9)+1;
			y=(int)(Math.random()*9)+1;
			z=(int)(Math.random()*9)+1;
		}while(x==y || y==z || z==x);
		
		//System.out.println(x + " " + y + " "+ z);
		
		int xx;
		int yy;
		int zz;
		do{
			do{
				System.out.println("숫자 3개를 입력하라");
				
				xx=Integer.parseInt(s.nextLine());
				yy=Integer.parseInt(s.nextLine());
				zz=Integer.parseInt(s.nextLine());
			}while(xx==yy || yy==zz || zz==xx);
				
			System.out.println();
		
			strike = ball =0;
			
			if(x==xx) {
				strike++;
			}
			if(y==yy){
				strike++;
			}
			if(z==zz){
				strike++;
			}
			
			if(x==yy || x==zz){
				ball++;
			}
			if(y==xx || y==zz){
				ball++;
			}
			if(z==xx || z==yy){
				ball++;
			}
			out= 3-(strike+ball); 
			
			System.out.println(strike+"strike! " + ball + "ball "+ out +"out ");
		}while(strike!=3);
		System.out.println("Mission complete");

		}



		}
	
	


