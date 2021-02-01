package io;

import com.sun.org.apache.xpath.internal.objects.XNull;

import java.io.*;

/**
 *缓冲字符输入流
 * java.io.BufferedReader
 * 内部维护一个缓冲区可以块读文本数据，并且可以按行读取字符串
 *
 * */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./src/main/java/io/BRDemo.java");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader bf=new BufferedReader(isr);//缓冲流，块读
        String line;
        /*
        * BufferedReader提供的方法
        * String readLine（）
        * 读取一行字符串，读取到换行符停止，并将换行符之前的内容以一个字符串形式返回（不含有最后的换行符）
        * 如果此行为空行，那只有换行符，则返回值为空字符串
        * 如果此方法返回值为null说明流读取到了末尾
        *
        * */
        while((line=bf.readLine())!=null){
            System.out.println(line);
        }
        bf.close();

    }

}
