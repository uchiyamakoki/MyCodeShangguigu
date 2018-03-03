package cn.momoka.oop.abstactClass;

public abstract class Animal {

	public  abstract void run();//将方法的设计与实现分离
	public void vreath(){
		System.out.println("呼吸！");
		run();
	}
	public Animal(){
		System.out.println("创造一个动物");
	}
}
class Cat extends Animal{

	@Override //重新，下面不能随便改名字
	public void run() {
		// TODO Auto-generated method stub
		
	}


}
class Dog extends Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}