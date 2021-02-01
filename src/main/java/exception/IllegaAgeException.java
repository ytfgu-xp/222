package exception;
/**
 * 自定义异常：通常用来说明满足语法但是不满足实际业务问题的异常。
 * 自定义异常的类名要做到见名知意并且要继承自Exception（直接，间接均可）
 *然后将Exception中所有的构造方法提供出来即可，不需要书写业务逻辑方法
 *
 * */
public class IllegaAgeException extends Exception {
    public IllegaAgeException() {
    }

    public IllegaAgeException(String message) {
        super(message);
    }

    public IllegaAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegaAgeException(Throwable cause) {
        super(cause);
    }

    public IllegaAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
