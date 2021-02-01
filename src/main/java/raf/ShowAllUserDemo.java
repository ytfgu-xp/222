package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 将user.dat文件中所有用户信息读取出来并输出到控制台
 * */
public class ShowAllUserDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("user.dat","r");
        for(int i=0;i<raf.length()/100;i++) {
            //读取用户名
            byte[] data = new byte[32];//一次性读取32个字节
            raf.read(data);
            String name = new String(data, "utf-8").trim();//用utf-8形式读出来并用trim方法将多余的空白清除
            //读取密码：
            raf.read(data);
            String psd = new String(data, "utf-8").trim();
            //读取昵称
            raf.read(data);
            String nickname = new String(data, "utf-8").trim();
            //读取年龄
            int age = raf.readInt();
            System.out.println("name:"+name+","+"psd:"+psd+","+"nickname:"+nickname+","+"age:"+age);
        }
        raf.close();

    }
}
