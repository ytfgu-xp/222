package string;
/**
 * String支持正则表达式方法之二：
 * string[] split（String regex）
 * 将当前字符串按照满足正则表达式的部分进行拆分，将拆分后的所有部分以一个string数组形式返回
 * */
public class SplitDemo {
    public static void main(String[] args) {
        String str="1312545adfabda4564daegdgad454dad4534dad5d5fa5";
        //按照字母部分进行拆分
        String[] arr=str.split("[a-z]+");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //按照.来拆分因为.在正则表达式表示任意字符，所以在拆分的时候需要转义
        //当遇到连续出现可拆分项时，则拆分后的第一项是空字符串
        //如果字符串最开始是可以拆分项，则拆分后的第一项是空字符串
        //注意：如果字符串末尾连续出现可拆分项，所有拆分出来的空字符串会被忽略
        String str1="123..456..789..213.4569.123";
        String[] a=str1.split("\\.");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);

        }
    }
}
