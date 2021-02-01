package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符输出流
 * java.io.BufferedWriter
 * 内部有缓冲区，可以块写文本数据来加快写出数据速度
 * java.io.PrintWtier
 * 具有自动行刷新的缓冲字符输出流，内部总是连接BufferedWriter作为其缓冲功能
 * */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw=new PrintWriter("demo.txt","utf-8");
        pw.println("让我掉下眼泪的，不止昨夜的酒，让我依依不舍的，不止你的温柔");
        pw.println("一路还要走多久，让我攥着你的手，成都，带不走的，只有你！");
        pw.println("和我在成都的街头走一走，哦~哦，直到所有的灯都熄灭了，也不停留了，你会攥着我的衣袖");
        System.out.println("写出完毕");
        pw.close();

    }


}
