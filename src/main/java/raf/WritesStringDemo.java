package raf;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
/**
 * 向文件中写入文本数据(字符串)
 * */
public class WritesStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile txt=new RandomAccessFile("A.txt","rw");
        /*
        * 常见的支持中文的字符集：
        * GBK：国标码，其中英文是1个字节，所有中文2字节
        * UTF-8：万国码，其中英文1字节。中文3字节
        *
        * String提供的方法
        * byte[] getBytes(String csn)
        * 将当前字符串内容按照指定的字符集转换为一组字节
        * 注意：字符集名字大小写无所谓。不要拼错
        * 该方法要求必须处理UnsupportedEncodingExceptiin异常
        * 当指定的字符集名字不对时，会抛出该异常
        * */
        String str="爱的魔力转圈圈，";
        byte[] bytes=str.getBytes("utf-8");//以utf-8形式得到需要写入的字符串
        txt.write(bytes);
        str="想你想到不管黑夜白天！";
        bytes=str.getBytes("utf-8");//以utf-8形式得到需要写入的字符串
        txt.write(bytes);//将得到的字符串写入文件中
        System.out.println("写完啦");
        txt.close();


    }
}
