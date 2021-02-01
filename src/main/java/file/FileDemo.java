package file;

import java.io.File;

/**
 * java.io.File可以表示硬盘上的一个文件或者目录
 * 使用File可以
 * 1.访问该文件或者目录的属性信息（大小、修改日期、可读可写）
 * 2.创建或者删除文件和目录
 * 3.访问一个目录中的所有子项
 * 但是File不能访问文件中的数据
 * */
public class FileDemo {
    public static void main(String[] args) {
        /*
        * Flie创建时可以指定路径
        * 该路径通常使用相对路径。它有更好的跨平台性
        * 相对路径中“./”表示当前目录，当前目录具体是哪里要看当前程序的运行环境而定
        * 在idea或者eclipse里运行时 当前目录就是这个程序所在的项目目录
        * */
//        File file=new File("./demo.txt");
//         String name=file.getName();//file.getName() 获取文件的文件名
//        System.out.println(name);
//        long len=file.length();//file.length（）获取文件的长度
//        System.out.println("字节数为："+len);
//        boolean cr=file.canRead();//判断文件是否可读，file.canRead（）；
//        System.out.println("可读："+cr);
//        boolean cw=file.canWrite();//判断文件是否可写，file.canWrite（）；
//        System.out.println("可写为："+cw);
//        boolean ih=file.isHidden();//判断文件是否隐藏：file.isHidden（）；
//        System.out.println("是否隐藏："+ih);
        File wj=new File("./demo.txt");
        String name=wj.getName();//获取文件的名字：String name=wj.getName();
        System.out.println(name);
        long len=wj.length();//文件的长度为long型，获取文件的长度：long len=wj.length();
        System.out.println(len);
        boolean d=wj.canRead();//canRead:判断文件是否可读boolean d=wj.canRead();
        System.out.println(d);
        boolean x=wj.canWrite();//canWrite:判断文件是否可写boolean x=wj.canWrite();
        System.out.println(x);
        boolean c=wj.isHidden();//isHidden:判读文件是否隐藏boolean c=wj.isHidden();
        System.out.println(c);

    }
}
