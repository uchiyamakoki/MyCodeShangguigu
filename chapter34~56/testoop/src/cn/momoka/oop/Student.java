package cn.momoka.oop;

public class Student {
	//静态的数据
	 String name;
	 int id;
	 int age;
	 String gender;
	 int  weight;
	 
	 Computer computer;
	 
	 public void study(){
		 System.out.println(name+"在学习");
	 }
	 public void sayHello(String sname){
		 System.out.println(name+"向"+sname+"说:你好！");
	 }
	 public static void main(String[] args) {
		 //通过类加载器Class Loader加载Student类,加载后在方法区中就有Student类的信息
		Student s1=new Student();
		
		s1.name="余一";
		s1.study();
		s1.sayHello("沈宁");
		
		Student s2=new Student();
		
	}
}
