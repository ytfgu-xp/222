package string;
/**
 * 判断字符串是否是以给定的字符串开始的
 * boolean starsWith(String str)
 *
 *
 * 判断字符串是否是以给定的字符串结尾的
 * boolean endsWith(String str)
 *
 * */
public class StarsWithDemo {
    public static void main(String[] args) {
        //判断str是否以www开始
        String str="www.baidu.com";
        boolean s=str.startsWith("www");
        System.out.println(s);
        //判断str是否以m结束
        boolean s1=str.endsWith("m");
        System.out.println(s1);
    }
}
