package exception;

/**
 * 异常的抛出
 * throw关键字可以主动抛出一个异常，通常下列情况会主动抛出异常
 * 1.当程序出现了一个异常但是该异常不应当在当前代码片段被解决时可以抛出给调用者解决
 * 2.当程序遇到一个满足语法但是不满足业务逻辑的情况时，可以主动创建一个对应的异常将其抛出给调用者告知这个情况
 *
 * */
public class ThrowDemo {
    public static void main(String[] args) {
        System.out.println("程序走起......");
        Person pr=new Person();
        /*
        * 满足语法，但是不满足业务的情况
        *
        * 当调用一个含有throws声明异常抛出的方法是，编译器要求必须处理这个异常，处理方式有两种
        * 在当前方法上继续使用throws声明该异常的抛出给上层调用者处理
        * 使用try-catch捕获并处理这个异常
        * 具体使用哪种取决于异常处理的责任问题
        * */
        try {
            pr.setAge(100000);//满足语法，但是不满足业务的情况
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("张三的年龄为"+pr.getAge());//
        System.out.println("程序结束了.......");
    }
}
