package string;

/**
 * String toLowerCase()
 *将当前字符串的英文部分转换为全小写
 *
 * String ToUpperCase()
 * 将当前字符串中的英文部分转换为大写
 *
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
            String str="我爱java";
        System.out.println(str);
        String str1=str.toUpperCase();// 转大写
        System.out.println(str1);
        String str2=str.toLowerCase();//转小写
        System.out.println(str2);

    }
}
