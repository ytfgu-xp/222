package raf;
/**
 * 简易记事本工具
 * 程序启动后要求用户输入一个文件名，然后对该文件进行写操作
 * 之后用户在控制台输入的每一行字符串都写入到该文件中（不用考虑换行问题）
 * 当用户单独输入exit时程序退出
 * */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
public class Note {
    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
        System.out.println("请输入文件名：");
        String fileName=sc.nextLine();
        RandomAccessFile file=new RandomAccessFile(fileName,"rw");
        System.out.println("请输入你要写入的字符串：");
        while(true){
            String line=sc.nextLine();
            if("exit".equals(line)){
                break;
            }
            byte[] data= line.getBytes("utf-8");
            file.write(data);
        }
        System.out.println("写入完毕");
        file.close();
    }
}
