package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


/**
 * 通过提高每次读写的数据量减少实际读写的次数可以提高读写效率
 * 单字节读写是随机读写
 * 一组字节读写是块读写
 * 对于机械硬盘而言，单字节读写几乎没有效率可言，块读写效率很好
 * 对于大部分硬件而言，减少硬件调用次数都可言都提高效率
 * */
public class CopyDemo {
    /*
    * RAF提供的块读写方法：
    *
    * 块写：void write（byte[] data）
    * 一次性将给定的字节数组中所有的字节写入文件
    *
    * 块读：int read（byte[] data）
    * 一次性从文件中读取给定的字节数组data总长度的字节量并将读取到的字节
    * 顺序的存入到该数组中，返回值为实际读取到的字节量
    *如果返回值为-1则表示读取到了文件末尾
    *
    * void write（byte[] data,int offset,int len）
    * 一次性将给定数组中从下标offest处开始的联系len个字节写入文件
    * */
    public static void main(String[] args) throws IOException {
        RandomAccessFile a=new RandomAccessFile("5.gif","rw");
        RandomAccessFile b=new RandomAccessFile("57.gif","rw");
        byte[] c=new byte[1024*10];//用一个数组来一次性读取10kb内容
        int len;//计算读取的长度
        while((len=a.read(c))!=-1){//判断是否为最后，不是最后就写入
            b.write(c,0,len);
            System.out.println("5555");
        }
        System.out.println("复制成功");
        a.close();
        b.close();
    }




}
