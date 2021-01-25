package integer;
/**
 * 包装类的常见功能
 * */
public class IntegerDemo2 {
    public static void main(String[] args) {
      //获取int最大值
      int max=Integer.MAX_VALUE;
      int min=Integer.MIN_VALUE;
        System.out.println("最大值为："+max+"，最小值为："+min);
        //获取double最大值
      double dmax=Double.MAX_VALUE;
      double dmin=Double.MIN_VALUE;
        System.out.println("double类型的最大值为："+dmax+"，double类型的最小值为："+dmin);
        //获取long最大值
        long lmax=Long.MAX_VALUE;
        long lmin=Long.MIN_VALUE;
        System.out.println("long的最大值为："+lmax+"，long的最小值为："+lmin);

        /*
        * 包装类提供了一个静态方法patseXXX（string line）
        * 可以将字符串解析为对应的基本类型数据。但是前提是该字符串正确描述了基本类型可以保存的值，否则会抛出异常
        * java.lang.NumberFormatException
        * */
        String line="123665";
        int a=Integer.parseInt(line);
        System.out.println(a);
        double b=Double.parseDouble(line);
        System.out.println(b);

        /*
        String str="123.646";
        int bb=Integer.parseInt(str);//该程序会编译错误，发生了异常
        System.out.println(bb);*/
    }
}
