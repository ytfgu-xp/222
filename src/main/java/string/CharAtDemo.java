package string;
/**
 * char charAt(int index)
 * 获取指定位置上的字符charAt 获取指定位置上字符串的字符 如 hello  charAt（1）  e
 * */
public class CharAtDemo {
    public static void main(String[] args) {
        String str="thinking in java";
        char c=str.charAt(6);//获取字符串第六个位置的字符
        System.out.println(c);
        String str1="hello world";
        char b=str1.charAt(6);
        System.out.println(b);
    }
}
