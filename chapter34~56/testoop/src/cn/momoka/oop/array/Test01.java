package cn.momoka.oop.array;

public class Test01 {
public static void main(String[] args) {
	int[] a=new int[3];
	a[0]=23;
	a[1]=28;
	a[2]=32;
	//a[3]=44;
	double[] b=new double[2];
	Car[] cars=new Car[10];
	cars[0]=new Car("奔驰");
	System.out.println(cars[0].name);
	System.out.println(a.length);
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
}
}
