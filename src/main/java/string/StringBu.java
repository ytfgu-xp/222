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
//        String str="我爱java";
//        StringBuilder builder2=new StringBuilder(str);
//        builder2.append("good good study day day up");
//        str=builder2.toString();
//        System.out.println(str);
//        //replace:替换当前字符串中的部分内容为指定的内容
//        builder2.replace(6,15,"hello");
//        System.out.println(builder2.toString());
//        StringBuilder builder = new StringBuilder(str);
//        builder.append("哈哈哈哈哈");
//        str=builder.toString();
//        System.out.println(str);
//        builder.replace(6,15,"哟哟哟");
//        System.out.println(builder.toString());
//        StringBuilder builder1=new StringBuilder(str);
//        builder1.append("哟哟哟，切克闹，煎饼果子来一套");
//        System.out.println(builder1.toString());
//        builder1.replace(6,15,"enen");
//        System.out.println(builder1.toString());
//        /*delete:删除当前字符串的部分内容*/
//        builder1.delete(0,11);
//        System.out.println(builder1.toString());
//        builder1.delete(0,6);
//        System.out.println(builder1.toString());
//        /**insert:将给懂内容插入到指定位置*/
//        builder1.insert(0,"活着");
//        System.out.println(builder1.toString());

        //字符串的增加操作
        String str="你好，我叫ytfgu，家住在重庆，很高兴认识大家";//append字符串的增加
        StringBuilder str1= new StringBuilder(str);
        str1.append("，请问你叫什么名字呢");
        System.out.println(str1.toString());
        //字符串的修改操作
        String s="hello,我叫许平，很高兴认识大家";
        StringBuilder s1= new StringBuilder(s);
        s1.replace(6,10,"ytfgu");//replace字符串的修改：6代表开始的下标，10表示结束的下标(含头不含尾)，ytfgu表示修改成为的字符
        System.out.println(s1.toString());
        s1.replace(6,11,"xp");
        System.out.println(s1.toString());
        //字符串的删除操作,delete（start（起始下标），end（结束下标））:删除：含头不含尾
        String st="你什么都不缺，缺的是一份从头开始的勇气";
        StringBuilder st1=new StringBuilder(st);
        st1.delete(0,7);
        System.out.println(st1.toString());
        //字符串的插入操作;insert
        String st3="千里为重，广大为庆，小香港重庆欢迎你";
        StringBuilder st4=new StringBuilder(st3);
        st4.insert(0,"你好，");
        System.out.println(st4.toString());



    }
}
