package cn.momoka.oop;

public class Test2 {
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="余一";
		s1.age=22;
		
		Computer c=new Computer();
		c.brand="联想";
		c.cpuSpeed=100;
		
		s1.computer=c;
		
		
		c.brand="戴尔";
		
		System.out.println(s1.computer.brand);
		
	}
	
}
