package file;
import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个目录：mkdir:创建一个文件目录
 *
 * */
public class MkDirDemo {
    public static void main(String[] args) throws IOException {
        //在当前目录下创建一个目录demo
//        File dir=new File("./xy/xp.txt");
//        if(dir.exists()){
//            System.out.println("该文件已经存在！");
//        }else{
//            dir.createNewFile();
//            System.out.println("文件已经创建！");
//        }
        //在当前目录中创建下级目录
        File x= new File("./xy/xx");
        if(x.exists()){
            System.out.println("该文件下面包括这个下级目录");
        }else{
            x.mkdirs();//x.mkdirs:创建目录以及多级目录
            System.out.println("下级目录创建成功");
        }

    }
}
