package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF是专门用来读写文件的类。其基于指针对文件进行随机读写
 *
 * */
public class FafDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        * RAF常用构造器
        * RandomAccessFile（File file(文件对象)，String mode）
        *  RandomAccessFile（String path（文件路径），String mode）
        * 第一个参数为要进行读写的文件，可以传入file对象也可以直接给定该文件的路径
        * 第二个参数为操作模式，有两种
        * r：只读模式，仅对该文件做读取数据操作
        * rw：读写模式，对文件读写均可
        * */
//        RandomAccessFile dir=new RandomAccessFile("./demo.txt","rw");
//        //向文件中写入一个字节的二进制数据
//        /*
//        * void write(int d)
//        *
//        * */
//        dir.write(258);
//        dir.write(2);
//        dir.write(3);
//        dir.write(4);
//        dir.write(5);
//        System.out.println("写完了");
//        dir.close();//最终要调用close方法

//写入数据到指定文件中
        RandomAccessFile p=new RandomAccessFile("A.txt","rw");
        p.write(1);//p.write（）：向已知文件中写入数句，截取是int最后的低八位二进制
        p.write(2);
        p.write(3);
        System.out.println("写完了");
        p.close();//读写完操作后一定要close关闭掉这个进程
        RandomAccessFile p1=new RandomAccessFile("A.txt","rw");
        int p2=p1.read();
        System.out.println(p2);
        p2=p1.read();
        System.out.println(p2);
        p2=p1.read();
        System.out.println(p2);
        p2=p1.read();//当文件里面的数据读取完后，若在读取里面的数据则会返回一个-1
        System.out.println(p2);


    }
}
