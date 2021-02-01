package file;
/**
 * 删除目录
 * */
import java.io.File;
public class DeleteDirDemo {
    public static void main(String[] args) {
        File del=new File("./A");
        if(del.exists()){
            //delete方法的删除目录时要求该目录必须是一个空目录才可以
            del.delete();
            System.out.println("文件已经删除");
        }else {
            System.out.println("目录不存在");

            }
        File de=new File("7.gif");
        if(de.exists()){//判断图片是否存在
            de.delete();//然后删除
            System.out.println("图片删除成功！");
        }else{
            System.out.println("图片不存在！");
        }
    }
}