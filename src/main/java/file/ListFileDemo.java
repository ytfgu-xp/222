package file;
/**
 * 获取一个目录下面的所有子项
 * */
import java.io.File;
public class ListFileDemo {
    public static void main(String[] args) {
        File lis=new File(".");//.表示当前目录
        /*
        * boolean isFile():判断当前File是否为一个文件
        * boolean isDirectory（）：判断当前File是否为一个目录
        * */
        if(lis.isDirectory()){
            File[] sub=lis.listFiles();
            System.out.println(sub.length);
            for(int i=0;i<sub.length;i++){
                System.out.println(sub[i]);
            }
        }
    }
}
