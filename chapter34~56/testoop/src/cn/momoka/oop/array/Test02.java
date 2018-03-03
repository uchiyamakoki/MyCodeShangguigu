package cn.momoka.oop.array;

public class Test02 {
	public static void main(String[] args) {
		//声明
		int[] a;
		int b[];
		
		//初始化 数组元素相当于对象的成员变量,初始化方式默认值与成员变量一致  数字0 布尔false char null
		a=new int[4];
		b=new int[5];
		
		for(int i=0;i<a.length;i++){
			a[i]=i*12;
		}
		//静态初始化
		int c[]={23,43,56,78};
		
		Car[] cars={
				new Car("奔驰"),
				new Car("比亚迪"),
				new Car("宝马")
				};
		Car c2=new Car("奔驰");
		System.out.println(c2==cars[0]);//内存地址。
	}
}
