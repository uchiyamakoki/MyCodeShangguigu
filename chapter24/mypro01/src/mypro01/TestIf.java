package mypro01;
/*
 * 测试if语句
 */
public class TestIf {
	public static void main(String[] args){
		double d=Math.random();
		int e=1+(int) (d*6); //大转小要强转,int忽略小数部分重点
		System.out.println(e);
		
		if(e>3){
			System.out.println("大数!");
		System.out.println("大数!!");
		}else {
			System.out.println("小数!");
		}
		System.out.println("测试多选择结构");
		if(e==6){
			System.out.println("运气非常好");
		}else if (e>=4) {
			System.out.println("运气不错");
		}else if (e>=2) {
			System.out.println("运气一般吧");
		}else {
			System.out.println("运气不好");
		}
		System.out.println("############################");
		switch (e) {//int,或者可以自动转为int的(byte,short,char)
		//JDK7.0甚至可以设置字符串 适用于等值判断，非大于几那种
		case 6:
			System.out.println("运气非常好");
			break; //没有break case穿透 电梯解释
		case 5:
			System.out.println("运气很不错");
			break;
		case 4:
			System.out.println("运气还行吧");
			break;
		default:
			System.out.println("运气不好");
			break;
		}
		System.out.println("**************************利用case穿透");
		char c='a';
		int rand=(int) (26*Math.random());
		char c2=(char) (c+rand);
		System.out.println(c2+":");
		switch (c2) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("元音"); break;
		case 'y':
		case 'w':
			System.out.println("半元音"); break;
		default:
			System.out.println("辅音");
			break;
		}
	}
	}
