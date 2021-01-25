package integer;
/**
 * 包装类
 * 包装类是为了解决基本类型不能直接参与面向对象开发的问题使得基本类型
 * 可以以对象的形式存在
 * 包装类都定义在java.lang包中作为基础类使用，6个数字类型的包装类继承自number
 * 其余两个直接继承自object
 * */
public class IntegerDemo {
    public static void main(String[] args) {
        //基本类型转化为包装类
        int d=123;
        //java不建议用new的形式来创建包装类 用valueof来创建
        //Integer.valueof创建包装类
        /*
        * 基本类型转换为包装类建议使用包装类的静态方法valueof对于integer而言，
        * 该方法会重用1字节之内的正数的包装类对象
        * */
        Integer i= Integer.valueOf(d);
        Integer i1=Integer.valueOf(d);
        //包装类都重写过equals方法
        System.out.println(i==i1);
        System.out.println(i.equals(i1));
        //包装类转换为基本类型
         d =i1.intValue();//将包装类表示的数字以int型返回
         System.out.println(d);

         double f=i1.doubleValue();//将包装类表示的数字以double型返
        System.out.println(f);

    }
}
