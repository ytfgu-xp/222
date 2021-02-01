package test;
/*输出字符串中的每一个字符*/
public class Test2 {
    public static void main(String[] args) {
        String name="hello world,thank you";
        for(int i=0;i<name.length();i++){
            char b=name.charAt(i);//charAt(获取指定位置的字符)
            System.out.println(b);
        }

    }
}
