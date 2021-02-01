package io;

import java.io.*;

/**
 * 使用缓冲输出流写出数据的缓冲区问题
 *
 * */
public class BOS_flushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream file=new FileOutputStream("demo.txt",true);
        BufferedOutputStream bos=new BufferedOutputStream(file);
        String sub="你好，哈哈哈哈哈";
        byte[] bytes=sub.getBytes("utf-8");
        bos.write(bytes);
        String sub1="fjasjgf  ldjlajdl lkjdsjgfldajf saljf dsljjf;s ";
        bytes=sub1.getBytes("utf-8");
        bos.write(bytes);
        /*
        * void flush（）
        * 将缓冲流已经缓存的数据一次性写出
        * 频繁的调用flush会增加实际写出数据的次数，写出次数多则
        * 写效率差，但是可以提供写出数据的即时性
        * */
        bos.flush();
        System.out.println("写入完毕");
        /*缓冲流的close方法中会执行一次flush*/
        bos.close();

    }
}
