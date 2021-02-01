package raf;
/**
 * 用户注册
 * 程序启动后要求用户顺序输入用户名，密码，昵称，年龄
 * 然后将记录写入文件user.dat中保存
 * 每条记录占用固定的100字节其中用户名 密码 昵称为字符串各占
 * 32字节，年龄为int值占4个字节
 * */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Reddemo {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("欢迎来到注册页面！");
        System.out.println();
        System.out.println("请输入用户名：");
        String name=sc.nextLine();
        System.out.println("请输入密码：");
        String psd=sc.nextLine();
        System.out.println("请输入昵称：");
        String nickname=sc.nextLine();
        System.out.println("请输入年龄：");
        int age=sc.nextInt();

        RandomAccessFile user=new RandomAccessFile("user.dat","rw");
        //将指针定位到末尾，好进行记录追加
        user.seek(user.length());
        //开始往文件里面写注册信息
        //1.写用户名,存入数组 然后用utf-8形式存储
        byte[] nameb=name.getBytes("utf-8");
        nameb= Arrays.copyOf(nameb,32);//对nameb数组进行扩容
        user.write(nameb);

        //2.写入密码
        nameb=psd.getBytes("utf-8");
        nameb=Arrays.copyOf(nameb,32);
        user.write(nameb);

        //3.写入昵称
        nameb=nickname.getBytes("utf-8");
        nameb=Arrays.copyOf(nameb,32);
        user.write(nameb);
        user.writeInt(age);
        user.close();
        System.out.println("注册完毕！");
    }
}
