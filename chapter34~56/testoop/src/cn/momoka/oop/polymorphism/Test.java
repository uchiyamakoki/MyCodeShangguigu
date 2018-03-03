package cn.momoka.oop.polymorphism;

public class Test {
	public static void testAnimalVoice(Animal c){
		c.voice();
		if(c instanceof Cat){
			((Cat)c).catchMouse();
		}
	}
	/*
	public static void testAnimalVoice(Dog c){
		c.voice();
	}
	public static void testAnimalVoice(Pig c){
		c.voice();
	}*/
	public static void main(String[] args) {
		//Cat c=new Cat();
		
		Animal a=new Cat();
		Animal b=new Dog();
		Animal c=new Pig();
		testAnimalVoice(a);
		testAnimalVoice(b);
		testAnimalVoice(c);
		
		Cat a2=(Cat)a;
		a2.catchMouse();
		
		
	}
}
