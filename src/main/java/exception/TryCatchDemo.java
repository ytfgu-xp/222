package exception;
/**
 * 异常处理机制中的try-catch
 * */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始运作了");
        try{
//        String name=null;
            String name="";
        /*
        * 如果name我null时，当虚拟机执行到下面的代码会发现这里存在空指针闲心，于是虚拟机会实例化一个空指针异常的实例
        * 并将其抛出 抛出后会检查报错的这句话是否被异常处理机制控制，如果没有则会将该异常抛出到钱方法外，由调用该方法的代码去解决（
        * 这里相当于抛出到main方法外面）
        * */
        System.out.println(name.length());
            System.out.println(name.charAt(0));
        //catch用来捕获try中出现的指定异常并予以解决
            //try语句块中报错代码以下内容都不会被执行
            System.out.println("144564645643");
        } catch (NullPointerException e){
            System.out.println("空指针异常");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("哈哈哈，字符串下标越界了");
            /*
            * catch超类异常的意义：
            * 当try中某几类异常希望使用相同出来办法时，可以catch这些异常的超类
            * 在最后一个catch出捕获Exception也可以避免因为一个未处理的异常导致程序中断
            *
            * 当多个catch的异常之间存在继承关系时，子类型异常要在上面先行捕获超类异常在下，否则编译不通过
            * */
        }catch (Exception e){
            System.out.println("反正就是出了一个错误");
        }
        System.out.println("程序结束了");
    }
}
