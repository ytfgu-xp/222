package file;
/**
 * 创建一个多级目录
 * */
import java.io.File;
public class MkDirsDemo {
    public static void main(String[] args) {
        //在的当前目录下创建多个目录
        File dirs=new File("./XP/XU/IO");
        if(dirs.exists()){
            System.out.println("目录已经创建");
        }else{
            /*
            * 与mkdir方法的区别是mkdires会将所有不存在的父目录
            * 自动创建出来，而mkdir则不会，如果父目录不存在则创建不成功
            *
            * */
            dirs.mkdirs();
            System.out.println("目录创建成功");
        }
    }
}
