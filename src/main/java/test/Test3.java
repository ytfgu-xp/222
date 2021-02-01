package test;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/*根据文件名来判断是否为png格式的*/
public class Test3 {
    public static void main(String[] args) throws FileNotFoundException {
        String img="xp.jpg";
        //String img1="xp.jpg";
        boolean pd=img.endsWith("png");//endswith是判断字符串是不是以给定的字符结尾的
        //boolean pf=img1.startsWith("png");//startswith是判断字符串是不是以给定的字符开始的
        if(pd){
            System.out.println("该图片是png格式的");
        }else{
            System.out.println("该图片不是png格式的");
        }
        //文件的赋值


    }
}
