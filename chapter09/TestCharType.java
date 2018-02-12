public class TestCharType{
	public static void main(String[] args){
		char c1='a';
		char c2='余'; //unicode:0-65535
		char c3='\t';
		System.out.print(c1);
		System.out.println(c3);
		System.out.println(c2);
		
		char c4='a';
		int i=c4+2;
		char c5=(char)i; //强制转型
		System.out.println(c5);
		
		for(int j=0;j<26;j++){
			char temp=(char)(c4+j);
			System.out.print(temp);
		}
		String str="abcdefghijklmnopqrstuvwxyz";
		System.out.println("\n"+str);
		boolean q=true;
		if(q){
			System.out.println("true");
		}
	}
}