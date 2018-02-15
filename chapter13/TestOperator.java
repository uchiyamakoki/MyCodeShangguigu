public class TestOperator{
	public static void main(String[] args){
		int d=10%3;
		System.out.println(d);
		
		int a=3;
		int b=a++; //b=3;a=4先赋值，再自增
		int c=++a;//c=5；a=5先自增，在赋值
		
		boolean c1=1<2&&2>(3/1);
		System.out.println(c1);
		
		int m=8;
		int n=4;
		System.out.println(m&n);
		System.out.println(m|n);
		System.out.println(~m);
		System.out.println(m^n);
		
		int a1=3*2*2;
		int b1=3<<3; //左移三次,移位运算速度比较快
		int c2=12/2/2;
		int d2=12>>2;
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c2);
		System.out.println(d2);
		
		int a2=3;
		a+=5; //a=a+5;
		
		boolean b3=true&false;
		System.out.println(b3);
		
		String str="5";
		int s=4;
		System.out.println(4+"5");
		
		int a4=3;
		int b4=5;
		String str1="";
		/*
		if(a4<b4){
			str1="a4<b4";
		}else{
			str1="a4>b4";
		}
		*/
		str1=(a4<b4)?"a4<b4":"a4>=b4";
		System.out.println(str1);
		
		
		
	}
}