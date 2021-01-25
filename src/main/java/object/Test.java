package object;
/**测试object中的常用方法
 * object中定义了方法:
 * String toString()
 * 作用是将当前对象转换为string
 * object中该方法的实现返回的字符串格式为：类名@地址
 * */
public class Test {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        /*
        * 向控制台输出的是是很常用的操作，当我们输出一个对象时
        * 实际上该方法会调用该对象的tostring方法。将返回的字符串输出到控制台
        * */
        System.out.println(p.toString());
        System.out.println(p);
        /**
         * 字符串与其他类型连接时，会将其他类型转换为string
         * 而转换也是依靠该对象的tostring
         *下面的代码实际上是将p.tostring（）返回的字符串连接的
         *
         * */
        String str="这个坐标是"+p;
        System.out.println(str);
        Point p1= new Point(1,2);
        /*
        * Object 提供了另一个常用方法：
        * boolena equals（object o）
        * 该方法的作用是比较当前对象与参数给定的对象内容是否相同但是如果子类不重写这个方法
        * 则该方法毫无价值因为object实现该方法时使用的是“==”比较的
        * */
        System.out.println(p.equals(p1));
        /*
        * java提供的类基本都妥善的重写了tostring和equals
        * 比如string
        * 只有我们自己定义的类在使用的时需要去重写
        * */

    }
}
