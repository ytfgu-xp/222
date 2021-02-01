package socket;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
/**聊天室客户端*/
public class Client {
    private Socket socket;//数据传输
    public Client(){//定义一个构造方法对成员初始化
        try {
            System.out.println("正在连接服务器");
            //host:ip地址  port：8088，给服务器发送指令建立连接
            socket=new Socket("localhost",8088);
            System.out.println("与服务器连接上了");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){//客户端启动,然后各种操作
        //向服务器端发送数据
        //向服务器发送数据的方法.getOutputStream();
        try {
            PrintWriter pw=new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream(),"utf-8"
                            )
                    ),true
            );//用字节流输出
            Scanner sc=new Scanner(System.in);
            while (true){
                String str=sc.nextLine();
                pw.println(str);
                if("exit".equals(str)){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();//最终不再通讯是要关闭scoket（相当于挂电话）
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {//main方法调用
        Client client=new Client();
        client.start();
    }
}
