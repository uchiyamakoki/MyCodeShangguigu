package cn.momoka.oop.inherit;

public class Animal {
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
}
class Mammal extends Animal{
	
	public void taisheng(){
		this.run();
		System.out.println("我是胎生！");
	}
}
class paxing extends Animal{
	
	public void run(){
		super.run();
		System.out.println("我是一只小小小小鸟");
	}
	
	public void eggsheng(){
		System.out.println("我是卵生！");
	}
}
