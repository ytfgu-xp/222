package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件输入流读取文件数据
 * */
public class FISDemo {
    public static void main(String[] args) throws IOException {
      /*  FileInputStream file=new FileInputStream("d.txt");
        byte[] data=new byte[1000];
        int len=file.read(data);
        System.out.println("该文件实际长度："+len);
        String str=new String(data,"utf-8").trim();
        System.out.println(str.length());
        System.out.println(str);*/
        //用输出流读取文件内容
        FileInputStream input =new FileInputStream("e.txt");
        byte[] data=new byte[1000];// 定义一个数组来接收文件里面的数据
        input.read(data);//然后把文件里面的数据长度读取出来
        /*
        * 将给定的字节数组从下标offeset出的联系len个字节按照utf-8编码转换为字符串
        * */
        String str=new String(data,"utf-8").trim();//定义一个string将data里面的数据用utf-8形式存入并将空白去掉
        System.out.println(str);
    }
}
