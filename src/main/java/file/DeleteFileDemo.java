package file;
/**
 * 删除一个文件
 * */
import java.io.File;
import java.io.IOException;

public class DeleteFileDemo {
    public static void main(String[] args) throws IOException {
        //创建文件
        File de=new File("./ytfgu.txt");
        if(de.exists()){
            System.out.println("不好意思，文件已经存在，请重新创建");

        }else{
            de.createNewFile();
            System.out.println("文件创建成功");
        }
        //删除文件
        if(de.exists()){
            de.delete();
            System.out.println("该文件已经删除，不好意思");
    }else{
            System.out.println("文件不存在");
        }
    }
}
