package testObject;

public class TestObject {
	public static void main(String[] args) {
		Object obj=new Object();
		Object obj2=new Object();
		System.out.println(obj.toString());
		System.out.println(obj2.toString());
		System.out.println(obj==obj2);
		
		Mobile m=new Mobile();
		System.out.println(m.toString());
	}
}
