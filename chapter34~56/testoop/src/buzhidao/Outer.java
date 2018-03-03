package buzhidao;

public class Outer {
public static void main(String[] args) {
	Face f=new Face();
	Face.Nose n=f.new Nose();
	n.breath();
}
}
class Face{
	int type=20;
	String shape="瓜子脸";
	static String q="脸色红润";
	class Nose{
		String type;
		void breath(){
			System.out.println(shape);
			System.out.println(Face.this.type);
			System.out.println("呼吸");
		}
	}
	static class Ear{
		void listen(){
			System.out.print(q);
		}
	}

}
