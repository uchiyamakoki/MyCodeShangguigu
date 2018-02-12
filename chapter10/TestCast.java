//测试自动转型和强制转型
public class TestCast{
	public static void main(String[] args){
		byte b=123;
		//byte b2=300;
		//char c=-3;
		char c2='a';
		int i=c2;
		long d01=123123;
		float f=d01;
		
		int i2=100;
		char c3=(char)i2;
		System.out.println(c3);
		
		int a=3;
		long b1=4;
		double d=5.3;
		int c=(int)(a+b1);
		float f1=(float)(a+d);
		
		int money=1000000000;
		int years=10;
		long total=(long)money*years;//如果后面加，已经是int溢出的部分了
		System.out.println(total);
		
		//一个人七十年心跳
		long times=70L*60*24*365*70;
		System.out.println(times);
	}
}