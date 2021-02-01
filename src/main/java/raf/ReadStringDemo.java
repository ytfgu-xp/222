package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *读取文件里面的内容
 *
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("b.txt","r");
        byte[] data=new byte[(int)raf.length()];
        raf.read(data);//一次性将文件所有字节读入数组
        //String的构造方法允许将给定的字节数组内容按照指定字符集还原文字
        String str=new String(data,"utf-8");//字符串的构造方法，String str=new String（接收数组，“utf-8”）
        System.out.println(str);
        raf.close();
    }
}
