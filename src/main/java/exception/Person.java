package exception;

import java.security.PrivateKey;

/**
 * 使用当前类测试异常的抛出
 * */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }
    /*
    * 当一个方法使用throws声明异常抛出时，调用该方法的代码就必须处理这个异常
    *
    * */
    public void setAge(int age) throws IllegaAgeException {
        if(age<0 || age>=100){
            //超过合理范围则对外抛出一个异常
            //throw new RuntimeException（"年龄不合法！"）；
            /*
            * 当一个方法中使用throw抛出一个异常时，就要求在当前方法上使用throws声明该异常的抛出
            * 只有RuntimeException是个例外
            *
            *
            * */
            throw new IllegaAgeException("你想长生不老吗？，你想秦春永驻吗?快来学习java吧，让你体验长生不老的滋味，无敌是多么多么的寂寞！");
        }
        this.age = age;
    }
}
