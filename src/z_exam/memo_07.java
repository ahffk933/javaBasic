package z_exam;



//public class memo_07 {
		
	



	/*	class Product
		{
			Product(){}
		int price; // 제품의 가격
		int bonusPoint; // 제품구매 시 제공하는 보너스점수
		Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
		}
		}
		
		
		
		class Tv extends Product {
		Tv() {}
		public String toString() {
		return "Tv";
		}
		}
		class Exercise7_5 {
		public static void main(String[] args) {
		Tv t = new Tv();
		}
		}*/
class Parent {
	int x = 100;

	Parent() {
		this(200);
	}

	Parent(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000);
	}

	Child(int x) {
		this.x = x;
	}
}

class Exercise7_7 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX());
	}
}







class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	int PrevChannel;  //이전채널 값을 저장할 멤버변수 정의
	
	
	public void setChannel(int channel) {
		if(channel < MIN_CHANNEL  || channel > MAX_CHANNEL){
			PrevChannel = this.channel;  //현재체널을 이전체널에 저장
			this.channel = channel;
			
		}
		
	}
	public int getChannel() {
		return channel;
	}
	public void gotoPrevChannel(){
		setChannel(PrevChannel);  //현재 채널을 이전 채널로 변경
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume < MIN_VOLUME || volume > MAX_VOLUME){
			this.volume = volume;
			
		}
	}
	
	
	
	}
	class Exercise7_10 {
	public static void main(String args[]) {
	MyTv2 t = new MyTv2();
	t.setChannel(10);
	System.out.println("CH:"+t.getChannel());
	t.setVolume(20);
	System.out.println("VOL:"+t.getVolume());
	}
	
	
	
	class Unit {}
	class AirUnit extends Unit {}
	class GroundUnit extends Unit {}
	class Tank extends GroundUnit {}
	class AirCraft extends AirUnit {}
	Unit u = new GroundUnit();
	Tank t = new Tank();
	AirCraft ac = new AirCraft();
	
/*	 u = (Unit)ac;
	 u = ac;
	 GroundUnit gu = (GroundUnit)u;
	 AirUnit au = ac;
	 t = (Tank)u;
	 GroundUnit gu = t;
*/	
	
	class Exercise7_20 {
		public void main(String[] args) {
			Parent p = new Child();
			Child c = new Child();
			System.out.println("p.x = " + p.x);
			p.method();
			System.out.println("c.x = " + c.x);
			c.method();
		}
	}

	class Parent {
		int x = 100;

		void method() {
			System.out.println("Parent Method");
		}
	}

	class Child extends Parent {
		int x = 200;

		void method() {
			System.out.println("Child Method");
		}
	}
		
		
		
		class Marine { // 보병
			int x, y; // 현재 위치
			void move(int x, int y) {  지정된 위치로 이동  }
			void stop() {  현재 위치에 정지  }
			void stimPack() {  스팀팩을 사용한다.}
			}
			class Tank { // 탱크
			int x, y; // 현재 위치
			void move(int x, int y) {  지정된 위치로 이동  }
			void stop() {  현재 위치에 정지  }
			void changeMode() {  공격모드를 변환한다. }
			}
			class Dropship { // 수송선
			int x, y; // 현재 위치
			void move(int x, int y) {  지정된 위치로 이동  }
			void stop() {  현재 위치에 정지  }
			void load() {  선택된 대상을 태운다. }
			void unload() {  선택된 대상을 내린다. }

	}
	
	
	
	}
