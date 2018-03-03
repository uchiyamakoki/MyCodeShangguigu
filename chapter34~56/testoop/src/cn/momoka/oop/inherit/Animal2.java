package cn.momoka.oop.inherit;

public class Animal2 {
	String eye;
	public void run(){
		System.out.println("跑跑！");
	}
	public void eat(){
		System.out.println("吃吃！");
	}
	public void sleep(){
		System.out.println("zzzzzzzzzzzz");
	}
	public static void main(String[] args) {
	paxing2  p=new paxing2();
	p.run();
	p.animal2.eat();
	}
}
class Mammal2{
	Animal2 animal3=new Animal2();
	public void taisheng(){
		
		System.out.println("我是胎生！");
	}
}
class paxing2{
	Animal2 animal2=new Animal2();
	public void run(){
		animal2.run();
		System.out.println("我是一只小小小小鸟");
	}
	
	public void eggsheng(){
		System.out.println("我是卵生！");
	}
}