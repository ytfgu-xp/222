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
        index=str.indexOf("in",3);//从小标3处  开始寻找第一次出现in的位置
        System.out.println(index);
        index=str.lastIndexOf("in");//检索最后一次出现给定字符串的位置
        System.out.println(index);
        String str4="ytfgu_xp";
        int a=str4.indexOf("f");
        System.out.println(a);
        int b=str4.indexOf("f",3);//从下标3开始找f出现的位置 因为后面没有f故为-1
        System.out.println(b);

    }
}
