package mypro01;
/*
 * 测试JDK7.0新特性
 */
public class TestSwitch {
	public static void main(String[] args){
		String a="沈宁";
		
		switch(a){
		case "余一":
			System.out.println("输入的余一");
			break;
		case "沈宁":
		 	System.out.println("输入的沈宁");
			break;
		default:
			System.out.println("大家好！");
			break;
		}
	}
}
