package mypro01;
/*
 * 测试while循环的用法
 */
public class TestWhile {
	public static void main(String[] args) {
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(100);
		*/
		int a=1;
		while(a<=100){
			System.out.println(a);
			a++;
		}
		System.out.println("While循环结束");
		//计算：1+2+3+....+1000
		int b=1;
		int sum=0;
		while(b<=100){
			sum=sum+b;
			b++;
		}
		System.out.println("和为："+sum);
	}

}
