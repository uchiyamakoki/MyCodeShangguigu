package testarray;

public class TestString {
	public static void main(String[] args) {
		String str="abcd";
		String str2=new String("abcd");
		System.out.println(str.charAt(2));
		System.out.println(str2.equals(str));
		System.out.println(str2==str);
		
		String str3="def";//神奇的常量池
		String str4="def";
		System.out.println(str3==str4);
		
		String str5=new String("abcd");
		String str6=new String("abcd");
		System.out.println(str5==str6);
		System.out.println(str5.indexOf("y"));
		String s=str3.substring(0);
		System.out.println(s);
		//emmmmmmmmm
		str3.replace('e', 'a');
		System.out.println(str3);
		
		String str7="  aa   bb";
		String str77=str7.trim();
		System.out.println(str77);
		
		
		System.out.println("Abc".equalsIgnoreCase("abc"));
		System.out.println("Abc".indexOf('b'));
		System.out.println("Abc".lastIndexOf('b'));
		System.out.println("Abc".startsWith("Ab"));
		System.out.println("Abc".toLowerCase());
		System.out.println("Abc".toUpperCase());
		
		String gh="a";
		for(int i=0;i<10;i++){
			gh+=i;
		}
		System.out.println(gh);
		
	}
}
