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
        //用正则表达式去替换部分内容(str1=str1.replaceAll("正则表达式规则"，"需要替换的内容"))
        String str1="dajkgdja1344akdf4545";
        str1=str1.replaceAll("[0-9]+","***");
        System.out.println(str1.toString());

        String str3="你好，你是一个dsb，wcnm";
        String str2="(cnm|dsb|wcnm|nc|fk|djb)";
        str3=str3.replaceAll(str2,"***");
        System.out.println(str3.toString());
        //隐藏脏话
        String st="你是一个dsb，wcnm，你走吧！";
        String s="(dsb|cnm|wcnm)";
        st=st.replaceAll(s,"***");
        System.out.println(st.toString());


    }
}
