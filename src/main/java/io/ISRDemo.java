package io;
import java.io.*;
/**
 * 使用转换流读取文本数据
 * */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream st=new FileInputStream("demo.txt");
//        InputStreamReader st1=new InputStreamReader(st,"utf-8");
//        int d;
//        while ((d=st1.read())!=-1){
//            System.out.print((char) d);
//        }
//        st1.close();
        //用字符流读取文件内容
        /*
        * int read();
        * 字符流的read（）方法是读取一个字符，返回的是一个“char”、
        * 但实际是用int型返回。因此该int值对应的2进制是“低16位”
        * 有效，如果int返回值为-1则表示文件末尾
        *
        * */
        FileInputStream st=new FileInputStream("demo.txt");
        InputStreamReader st1=new InputStreamReader(st,"utf-8");
        int len;
        while ((len=st1.read())!=-1){//如果文件长度不等于-1就一直执行
            System.out.println((char)len);//把读出来的长度用字符表示出来
        }
    }

}
