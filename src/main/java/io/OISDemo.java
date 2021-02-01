package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输入流，把数据读回来
 * */
public class OISDemo {
    //读取person文件中的person对象
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream file=new FileInputStream("t.txt");
        ObjectInputStream file1=new ObjectInputStream(file);
        /*
        * Object readObjetc()
        * 对象输入流提供的readObject方法是可以将读取的字节还原为
        * 对应的java对象。前提是读取的字节应当是对象输出流将一个
        * 对象转换为一组字节，返回时统一以Object类型返回。因此
        * 接收到该对象后要造型（强转）
        * */
        Person p=(Person) file1.readObject();
        System.out.println(p);
        file1.close();

    }

}
