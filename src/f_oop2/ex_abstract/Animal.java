package f_oop2.ex_abstract;

public abstract class Animal {
	
	void run(){
		System.out.println("달려간드아아아아아ㅏㅇ~~");
	}
	
	abstract void bark();
	
}

class Dog extends Animal{

	@Override
	void bark() {
		System.out.println("왈왈왈ㄹ!!");
	}
}
class Cat extends Animal{

	@Override
	void bark() {
		System.out.println("애옹~~~");
		
	}
}
class Chicken extends Animal{

	@Override
	void bark() {
		System.out.println("꼬꼬다앍~~!!!");
		
	}
}
