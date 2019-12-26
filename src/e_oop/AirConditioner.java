package e_oop;

public class AirConditioner {
	public static void main(String[] args) {
		AirConditioner ac = new AirConditioner();
		ac.power();
		System.out.println(ac.power);
		
		ac.temperatureUp();
		System.out.println(ac.temperature);
	}
	
	//전원, 온도, 풍량조절
	boolean power; //전원
	int temperature; //온도
	int airVolume; //풍량
	

	
	//온도가 18~30까지만 변경 할 수 있게 하고, 전원을 켰을때만 버튼이 작동되도록 메서드들을 변경하라
	
	AirConditioner(){
		power = false;
		temperature = 18;
		airVolume = 1;
	}
	
	//전원버튼
	void power(){
		power = !power;
	}
	
	//온도 +버튼
	void temperatureUp(){
		if(power && temperature < 30){
				temperature++;
				
			}
		}
	
	//온도 -버튼
	void temperatureDown(){
		if(power && 18 < temperature){
			temperature--;
		}
		
		temperature--;
	}
	
	//풍량 버튼
	void airVolume(){
		if(power){
			if(3 < ++airVolume && power){
				airVolume = 1;
			
		}
	}
}


}
