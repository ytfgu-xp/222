package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读写基本类型数据，以及RAF指针的操作
 *
 * */
public class RafDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("b.txt","rw");
        long pos=raf.getFilePointer();
        System.out.println(pos);
        //int最大值为 int max=Integer.MAX_VALUE;
        int i=20;
        raf.write(i>>>24);
        System.out.println(raf.getFilePointer());
        raf.write(i>>>16);
        raf.write(i>>>8);
        raf.write(i);
        System.out.println(raf.getFilePointer());
        System.out.println("写入完毕，请指示");
        /*
        * RAF提供了方便写出基本类型数据的方法
        *
        * */
        raf.writeInt(i);//连续写4个字节将int值写出，等同上面4句代码
        System.out.println(raf.getFilePointer());
        System.out.println("写入完毕");
        raf.seek(0);
        int d=raf.readInt();//读取int值
        System.out.println(d);

        raf.seek(8);//读取long值，要读取某个值是，首先得吧指针挪过去
        long l=raf.readLong();
        System.out.println(l);
        System.out.println(raf.getFilePointer());//16

        //读取double值
//        double dd=raf.readDouble();
//        System.out.println(dd);
//        System.out.println(raf.getFilePointer());
        /*
        * 修改文件中int所在位置的值改为45644
        * 1、将指针移动到int值的开始位置
        * 2、重写写入新的int值来覆盖原有数据
        * */
        raf.seek(1);
        raf.writeInt(45644);
        raf.seek(1);
        int c=raf.readInt();
        System.out.println(c);
        raf.close();
    }
}
