package string;
/**
 * string支持正则表达式的方法之三：
 * String replaceAll（String regex，String str）
 * 将当前字符串中满足正则表达式的部分替换为给定内容
 * */
public class replaceAllDemo {
    public static void main(String[] args) {
        String str="abdfdajldjfsljfad55dasd3";
        //将满足的部分替换为空字符串可以达到“去除”的效果
        str=str.replaceAll("[a-z]+","666");
        System.out.println(str);
        String ch="(cnm|dsb|wqnm|mdzz|nc|fk|djb)";//括号里面是一个整体 表示并列之一有一个满足即可
        String message="fk,你是一个dsb，哈哈哈";
        message=message.replaceAll(ch,"***");
        System.out.println(message);
    }
}
