package exception;

import java.io.*;

/**
 * jdk7后，java推出了一个新的特性：自动关闭
 * */
public class AutoloseableDemo {
    public static void main(String[] args) {
        //try后面的（）中初始化的类必须实现Autoloseable接口
        try(FileOutputStream fos=new FileOutputStream("A.txt");
            /*
            * 编译器编译后会将try（）里初始化的类在finally中调用close
            * 编译后的diamante相当于是FinallyDemo的样子
            * */
            FileInputStream file=new FileInputStream("B.txt");

            /*流连接初始化写法*/
//            PrintWriter pw=new PrintWriter(
//                    new BufferedWriter(
//                            new OutputStreamWriter(
//                                    new FileOutputStream("A.txt")
//                            )
//                    )
//            );
        ){
            fos.write(1);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
