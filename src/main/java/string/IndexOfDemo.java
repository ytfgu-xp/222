package string;
/**
 * int indexOf(String str)
 * 返回给定字符串在当前字符串的位置如果当前字符串不包含给定内容则返回值为-1
 * */
public class IndexOfDemo {
    public static void main(String[] args) {
        String str="thinking in java";
        int index=str.indexOf("in");
        System.out.println(index);
        index=str.indexOf("in",2);//从下标2处开始寻找第一次出现in的位置
        System.out.println(index);
        index=str.indexOf("in",3);//从小标3处开始寻找第一次出现in的位置
        System.out.println(index);
        index=str.lastIndexOf("in");//检索最后一次出现给定字符串的位置
        System.out.println(index);

    }
}
