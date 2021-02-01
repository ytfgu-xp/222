package io;

import com.sun.scenario.animation.shared.ClipEnvelope;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 *  1.创建文件输入流读取原文件
 *  2.创建文件输出流写入复制文件
 *  3.循环块读写完成复制
 *  4.关闭两个流
 * */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream st=new FileInputStream("e.txt");
        FileOutputStream st1=new FileOutputStream("ggk.txt");
        byte[] data=new byte[1024*10];
        int len;
        while((len=st.read(data))!=-1){
            st1.write(data);
        }
        System.out.println("复制完毕");
        st.close();
        st1.close();


    }
}
