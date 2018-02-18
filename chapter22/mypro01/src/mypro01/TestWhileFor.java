package mypro01;
/*
 * while和for的练习题目
 */
public class TestWhileFor {
	public static void main(String[] args) {
		int a=1;
		int sum=0;
		while(a<100){
			sum=sum+a;
			a=a+2;
		}
		System.out.println("100以内的奇数和为："+sum);
		int sum2=0;
		for(int i=2;i<=100;i=i+2){
			sum2=sum2+i;
		}
		System.out.println("100以内的偶数和为："+sum2);
		int f=1;
		for(int b=1;b<=1000;b++){
			if(b%5==0){
				if(f%3!=0){
				System.out.print(b+" ");
				}else {
				System.out.println(b);
				}
				f++;
			}
		}
	}

}
