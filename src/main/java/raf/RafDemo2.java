package raf;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 从文件中读取数据
 *
 * */
public class RafDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile re=new RandomAccessFile("./demo.txt","r");
        /*
        * int read()
        * 从文件中读取1个字节，并以int型返回，实际读取的字节是在返回的
        * int值对应的2进制的低八位，但如果返回值为-1则表示文件末尾：EOF：end of file
        *
        * */
        int a=re.read();
        System.out.println(a);
        a=re.read();
        System.out.println(a);
        a=re.read();
        System.out.println(a);
        a=re.read();
        System.out.println(a);
        a=re.read();
        System.out.println(a);
        a=re.read();
        System.out.println(a);//-1,已到文件末尾所以返回值为-1
        re.close();

    }
}
