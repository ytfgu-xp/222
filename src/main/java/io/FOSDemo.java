package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * java标准的io可以用相同的读写方式读写不同的设备
 * java将io比喻为流，可以理解为是连接程序与设备之间的管道，管道里面是
 * 按照同一个方向顺序流动的字节
 * java将流的方向划分为两个操作
 * 输入：用来读取，是从设备到程序的方向，是获取的数据使用的
 * 输出：用来写出，是从程序到设备的方向，用来发送数据使用的
 * java.io.InputStream是所有字节输入流的超类，里面定义了读取字节的方法
 * java.io.Outputstream是所有字节输出流的超类，定义了写出字节的方法
 * java将流分为两类，节点流和处理流
 * 节点流：也称为低级流，是实际连接程序与设备的管道，负责实际读取字节的流
 *       读写一定是建立在节点流的基础上进行的，操作不同的设备有对应的低级流
 *        例如读写文件也有文件流
 * 处理流：也称为高级流，不能独立存在，必须连接在其他流上，目的是当数据流经当前流时，对其做某些加工处理，简化我们的操作
 * 实际开发中我们总是会串联一组高级流最终连接到低级流上没在数据进行读写的过程中对数据做流水线的加工处理，这也成为流连接，
 * 也是IO精髓
 *
 * 文件流
 * 文件流时一堆低级流，用于读写文件的流，功能上与RandomAccessFile一致，
 * java.io.FileInputStream和FileUutputStream
 *
 * 文件输出流构造方法：
 * FileOutputStream（String path）
 * FileOutputStream（File file）
 * 以上两种构造器创建的文件流为覆盖写模式
 * 即：创建文件流时如果指定的文件已经存在，则会将该文件内容清空
 * 然后使用这个流写出的数据会顺序希尔文件作为新数据保存
 * 注意：
 * RAF则是从头开始写多少覆盖多少（在不操作指针的情况下）
 *
 *
 * 文件流的重载构造
 * FileOutputStream（String path，boolean append）
 * FileOutputStream（File file,boolean append）
 * 如果第二个参数指定，并且指定的值为true时，则当前文件流为
 * 追加模式，即：创建文件流时如果文件存在，那么文件原有数据保留通过这个流
 * 写入的数据都会被追加到文件中。
 *
 * */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
       /* FileOutputStream out=new FileOutputStream("e.txt");//文件流引入，要写入数据的文件
        String str="我要忘了你的样子，像鱼忘了水的拥抱";//将要写的文字表达出来
        byte[] sub=str.getBytes("utf-8");//然后用sub数组来接收并用getbytes（）utf-8来接收
        out.write(sub);//然后写入并输出
        str="我要记住你的样子，像鱼记住水的味道";
        sub=str.getBytes("utf-8");
        out.write(sub);
        System.out.println("写入完毕");
        out.close();*/
        FileOutputStream file=new FileOutputStream("d.txt");
        String str1="我要记住你的样子，像鱼记住水的拥抱，像云在天空中停靠";
        byte[] sub=str1.getBytes("utf-8");
        file.write(sub);
        String str2="我要忘了你的样子，像鱼忘了海的味道，放下所有梦和烦恼，却放不下会议的记号";
        sub=str2.getBytes("utf-8");
        String str3="让青春吹动了你的长发，让它牵引你的梦，";
        sub=str3.getBytes("utf-8");
        file.write(sub);
        String str="教室里那台风琴叮咚叮咚叮铃，像你在的地方动作一直很轻，你微笑";
        sub=str.getBytes("utf-8");
        file.write(sub);
        System.out.println("写入完毕！！！");
        file.close();
    }
}
