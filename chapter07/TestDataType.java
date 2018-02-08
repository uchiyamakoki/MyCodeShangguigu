public class TestDataType{
	public static void main(String[] args){
		int a=10;
		int a2=010; //八进制
		int a3=0xf;
		//byte b=200;
		System.out.println(a);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));
		
		int a5=10;
		long a6=200;
		byte b2=100;  //100是int（4位），但没超过范围，所以可以转换
		long a7=2222222222222222L;
	}
}