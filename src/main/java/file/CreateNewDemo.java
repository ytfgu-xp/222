package file;
/**
 * 使用File创建一个文件
 * */
import java.io.File;
import java.io.IOException;

public class CreateNewDemo {
    public static void main(String[] args) throws IOException {
        //在当前目录下创建一个新的文件
        //File create=new File("./test.txt");
        /*
        * boolean exists()
        * 判断当前File表示的文件或者目录是否已经存在
        * 存在则返回true
        *
        * */
//        if(create.exists()){
//            System.out.println("该文件已经存在");
//        }else{
//            //将File表示的文件表示出来
//            create.createNewFile();
//            System.out.println("文件已创建");
//        }
        //在当前目录下创建一个文件
        File wj= new File("./A.txt");
        if(wj.exists()){//wj.exists（）：//判断文件是否存在
            System.out.println("文件已经创建，请重新命名创建");
        }else{
            wj.createNewFile();//创建文件：对象.createNewFile（）；
            System.out.println("文件创建成功，棒棒哒");
        }

    }
}
