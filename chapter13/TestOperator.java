public class TestOperator{
	public static void main(String[] args){
		int d=10%3;
		System.out.println(d);
		
		int a=3;
		int b=a++; //b=3;a=4�ȸ�ֵ��������
		int c=++a;//c=5��a=5���������ڸ�ֵ
		
		boolean c1=1<2&&2>(3/1);
		System.out.println(c1);
		
		int m=8;
		int n=4;
		System.out.println(m&n);
		System.out.println(m|n);
		System.out.println(~m);
		System.out.println(m^n);
		
		int a1=3*2*2;
		int b1=3<<3; //��������,��λ�����ٶȱȽϿ�
		int c2=12/2/2;
		int d2=12>>2;
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c2);
		System.out.println(d2);
		
		int a2=3
		a+=5; //a=a+5;
		
		
	}
}