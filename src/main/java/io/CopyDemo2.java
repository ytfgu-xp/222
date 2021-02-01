package io;

import java.io.*;

/**
 * 使用缓冲流完成文件复制
 * 缓冲流：java.io.BufferedIuptStream和BufferedOutputStream
 * 它们是一对高级流，在流连接中的作用是提供读写速度
 * */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("55.exe");
        BufferedInputStream is= new BufferedInputStream(file);
        FileOutputStream file1=new FileOutputStream("77.exe");
        BufferedOutputStream os=new BufferedOutputStream(file1);
        int d;
        long sta=System.currentTimeMillis();
        /*
        * 缓冲流内部维护着一个字节数组，默认为8k，无论我们读写时用哪种方式，
        * 最终都会被缓冲流转化为块读写8k 8k的进行来保证读写效率
        * */
        while((d=is.read())!=-1){
            os.write(d);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制完毕"+"总共耗时:"+(end-sta)+"ms");
        is.close();
        os.close();

    }
}
