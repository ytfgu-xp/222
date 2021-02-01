package test;

import java.io.File;
import java.io.FileFilter;

/**
 * **
 *  * 列出当前目录中所有名字包含s的子项。
 *  *
 *  * 使用匿名内部类和lambda两种写法
 *  *
 *  * 单词记一记:
 *  * FileFilter   文件过滤器
 *  * accept       接受
 *  *
 * */
public class Test6 {
    public static void main(String[] args) {
        File list=new File(".");//获取文件的所有子项
        if(list.isDirectory()){//list.isDirectory():判断该子项是否为文件
            FileFilter filter =new FileFilter() {
                public boolean accept(File file) {
                    return file.getName().contains("s");
                }
            };
            File[] sub=list.listFiles(filter);//用数组sub来接收是文件的所有项目
            for(int i=0;i<sub.length;i++){
                System.out.println(sub[i]);
            }
        }
    }
}
