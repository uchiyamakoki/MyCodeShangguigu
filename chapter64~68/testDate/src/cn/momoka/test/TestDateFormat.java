package cn.momoka.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) {
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss,属于本月的第w周");//格式化字符串

        Date a=new Date(123213123L);
        String str=df.format(a);//将时间对象按照格式化转换成字符串
        System.out.println(str);

        String str2="1977-7-7";
        DateFormat df2=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d2=df2.parse(str2);
            System.out.println(d2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
