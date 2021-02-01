package exception;
/**
 * 异常常见的方法
 *
 * */
public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String name="aba";
            System.out.println(Integer.parseInt(name));
        } catch (NumberFormatException e) {
            e.printStackTrace();//向控制条输出异常信息

            String message=e.getMessage();
            /*
            * 获取错误消息，通常给用户提示或者记录日志的时候
            * 会使用到它
            *
            * */
            System.out.println(message);
        }
        System.out.println("程序结束了");
    }
}
