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
        String s3="hello java";
        boolean s4=s3.startsWith("h");
        System.out.println(s4);
        boolean s5=s3.endsWith("j");
        System.out.println(s5);
    }
}
