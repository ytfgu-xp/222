package string;
/**
 * String的优化导致其为不变对象，这会存在利于重用但是不利于修改操作。
 * 频繁修改string会降低并有较多的系统开销
 * java.lang.stringBuilder是专门用来修改string的api其内部维护
 * 一个可以变的char数组并提供了多种修改字符串内容的方法，例如，增删插改，
 * string原有的相关方法， indexof length等
 * stringbuilder修改string内容速度快，开销小
 * */
public class StringBu {
    public static void main(String[] args) {
        //内部表示空字符串
        //StringBuilder builder=new StringBuilder();//创建了一个空的字符串

        //在原有的字符串对象上重新创建
//        StringBuilder builder1=new StringBuilder(str);
//        builder1.append(",好好学习，天天向上");
//        str=builder1.toString();
//        System.out.println(str);
        String str="我爱java";
        StringBuilder builder2=new StringBuilder(str);
        builder2.append("good good study day day up");
        str=builder2.toString();
        System.out.println(str);
        //replace:替换当前字符串中的部分内容为指定的内容
        builder2.replace(6,15,"hello");
        System.out.println(builder2.toString());
        StringBuilder builder = new StringBuilder(str);
        builder.append("哈哈哈哈哈");
        str=builder.toString();
        System.out.println(str);
        builder.replace(6,15,"哟哟哟");
        System.out.println(builder.toString());
        StringBuilder builder1=new StringBuilder(str);
        builder1.append("哟哟哟，切克闹，煎饼果子来一套");
        System.out.println(builder1.toString());
        builder1.replace(6,15,"enen");
        System.out.println(builder1.toString());
        /*delete:删除当前字符串的部分内容*/
        builder1.delete(0,11);
        System.out.println(builder1.toString());
        builder1.delete(0,6);
        System.out.println(builder1.toString());
        /**insert:将给懂内容插入到指定位置*/
        builder1.insert(0,"活着");
        System.out.println(builder1.toString());

    }
}
