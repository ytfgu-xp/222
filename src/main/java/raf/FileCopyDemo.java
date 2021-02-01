package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件的赋复制
 * */
public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile st=new RandomAccessFile("5.gif","rw");
        RandomAccessFile st1=new RandomAccessFile("7.gif","rw");
        //用来记录每次读取到的字节
        int d;
        //获取当前系统的毫秒值
        long start=System.currentTimeMillis();
        while((d=st.read())!=-1){
            st1.write(d);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制完毕"+",总共耗时"+(end-start)+"ms");
        st.close();
        st1.close();
    }
}
