package mypro01;

public class TestMethod {

public static void main(String[] args) {
	//test01();
	//test02();
	int s=add(3, 5);
	System.out.println(s);
}
public static int add(int a,int b){
	int sum=a+b;
	if(a==3){
		return 0;  //return 1.结束方法运行 2.返回值
	}
	System.out.println("输出");
	return sum;
}
public static void test01(){
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
}
public static void test02(){
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
