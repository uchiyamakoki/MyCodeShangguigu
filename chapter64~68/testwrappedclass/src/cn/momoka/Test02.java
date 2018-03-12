package cn.momoka;

public class Test02 {
    public static void main(String[] args) {
        Integer a=1000;//自动装箱 相当于new Integer(1000)
        Integer b=1000;

        int c=new Integer(1500);//编译器改进 多了.intValue

    }
}
