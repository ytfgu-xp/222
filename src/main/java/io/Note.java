package io;
/**
 * 简易记事本功能
 * 程序启动后要求用户输入文件名然后就对文件进行写操作
 * 之后用户输入每一行字符串都要按照行写入到文件中
 * 当用户单独输入exit时程序退出
 * 要求：创建printwrtier并且自行创建流连接完成
 * */
import java.io.*;
import java.util.Scanner;
public class Note {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入文件名：");
        String file=sc.nextLine();
        FileOutputStream fos=new FileOutputStream(file);
        OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
        BufferedWriter bw=new BufferedWriter(osw);
        PrintWriter pw=new PrintWriter(bw,true);//autoFlush:自动行刷新
        /*
        * 当创建pw时，第一个参数为流，则可以在传入一个boolean型的参数，
        * 如果这个值为true，则当前pw具有自动行刷新功能，即
        * 每当我们调用println方法后会自动flush
        * */
        System.out.println("请向文件中输入数据：");
        while (true){
            String ne =sc.nextLine();
            if("exit".equals(ne)){
                break;
            }
            pw.println(ne);
        }
        System.out.println("写入完毕");
        pw.close();

    }
}
