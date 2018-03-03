package cn.momoka.oop.polymorphism.myServlet;

public class myServlet {
	public void service(){
		System.out.println("HttpServlet.service()");
		doGet();
	}
	public void doGet(){
		System.out.println("HttpServlet doGet()");
	}
	public void  doPost(){
		
	}
}
