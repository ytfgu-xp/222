package socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/**聊天室服务端*/
public class Server {
    private ServerSocket serverSocket;//服务器接收数据
    public Server(){//
        //8080是服务器开的端口，客户端只能从8088这个端口进入
        try {
            System.out.println("正在启动服务器");
            serverSocket=new ServerSocket(8088);
            System.out.println("服务器启动完毕！！！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void  start (){//服务器的一些操作功能
        try {
            while (true){
                System.out.println("等待客户端的进入....");
                Socket socket=serverSocket.accept();//调用accept方法是客户端接入到服务器
                System.out.println("客户端已进入....");
                BufferedReader br=new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(),"utf-8"
                        )
                );
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
                if("exit".equals(socket.getInputStream())){
                    br.close();
                }
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {//主程序入口
        Server server=new Server();
        server.start();
    }
}
