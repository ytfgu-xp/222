package string;
/**
 * String trim()
 * 去掉字符串两边的空白字符
 * */
public class TrimDemo {
    public static void main(String[] args) {
        String str="    hello           ";
        System.out.println(str);
        String trim=str.trim();
        System.out.println(trim);
    }
}
