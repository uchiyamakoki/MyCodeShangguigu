package cn.momoka.oop.encapsulation;

public class Test01 {
	private String str;
	protected void println(){
		String s=str;
		System.out.println("test01.print()");
	}
}
class Test001 extends Test01{
	public void pp(){
		println();
	}
}
