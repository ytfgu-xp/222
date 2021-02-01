package string;
/**
 * String支持正则表达式的方法之一：
 * boolean matches（String regex）
 * 使用给定的正则表达式验证当前字符串是否符合格式要求，符合则返回true
 * */
public class MatchesDemo {
    public static void main(String[] args) {
//        String email="575696077@qq.com";
//        /*邮箱的正则表达式：[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+*/
//        String yy="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
//        boolean match=email.matches(yy);
//        if(match){
//            System.out.println("是邮箱");
//        }else{
//            System.out.println("不是邮箱");
//        }
        //正则表达式之邮箱验证-----
        String email="12458689278@qq.com";//定义一个邮箱
        //判断email邮箱是否满足pd给定的正则表达式规则 判断正则表达式：boolean a=定义的邮箱.matches（定义正则表达式规则）
        String pd="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";//编写邮箱的正则表达式
        boolean oo=email.matches(pd);
        if(oo){
            System.out.println("是正确邮箱");
        }else{
            System.out.println("不是正确邮箱");
        }
    }
}
