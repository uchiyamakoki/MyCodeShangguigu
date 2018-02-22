package cn.bjsxt.test;
/**
 * 测试递归算法的基本流程，并写了一个阶乘的例子。
 * @author 沈宁
 * @version 1.0
 * 
 *
 */
public class TestRecursion {
	static int a=0;
	/**
	 * 测试递归头和递归值的基本作用
	 */
	public static void test01(){
		a++;
		System.out.println("test01:"+a);
		if(a<=10){ 
		test01();
		}else {
			System.out.println("over");
		}
	}
	/**
	 * 我是test02
	 */
	public static void test02(){
		System.out.println("TestRecursion.test02()");
	}
	public static void test03(){
		System.out.println("TestRecursion.test03()");
	}
	/**
	 * 计算 阶乘 阶乘的意思5*4*3*2*1
	 * @param n 阶乘的最大数
	 * @return 返回阶乘的结果值
	 */
	public static long factorial(int n){
		if(n==1){
			return 1;
		}else {
			return n*factorial(n-1);
		}	
	}
	public static void main(String[] args) {
		//test01();
		System.out.println(factorial(13));
	}
}
