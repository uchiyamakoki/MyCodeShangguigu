package cn.momoka.oop.this00;

public class Student {
	String name;
	int id;
	
	public Student(String name,int id){
		this();//通过this调用其他构造方法,必须第一句
		this.name=name;
		this.id=id;
	}
	public Student(){
		System.out.println("构造一个对象");
	}
	public void setName(String name){
		this.name=name;
	}
	public void study(){//隐式参数this，super，对象地址，栈空间里的
		this.name="余一";
		System.out.println(name+"在学习");
	}
	public void sayHello(String sname){
		System.out.println(name+"向"+sname+"说：你好！");
	}
}
