package string;
/**
 * static String valueOf（XXX xxx）
 * String提供了一组重载的静态方法;valueof作用是将java中其他类型转换为string
 * 最长使用于将基本类型转换为字符串
 * */
public class ValueOfDemo {
    public static void main(String[] args) {
        int i=30;
        String str=String.valueOf(i);
        System.out.println(i);
        double db=23.33322211;
        String str1=String.valueOf(db);
        System.out.println(str1);
        String s3=i+"";
        System.out.println(s3);

    }
}
