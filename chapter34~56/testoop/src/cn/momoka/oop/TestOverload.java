package cn.momoka.oop;

public class TestOverload {
	public static void main(String[] args) {
		MyMath m=new MyMath();
		int result=m.add(4.2, 5);
		System.out.println(result);
	}
	public static class MyMath{
		int a;
		public MyMath(){
			
		}
		public MyMath(int a){
			this.a=a;
		}
		public int add(int a,int b){
			return a+b;
		}
		public int add(int a,int b,int c){
			return a+b+c;
		}
		public int add(double a,int b){
			return (int) (a+b);
		}
		public int add(int b,double a){
			return (int) (a+b);
		}
	}
}
