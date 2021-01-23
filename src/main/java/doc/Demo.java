package doc;
/**
 * 文档注释只用在三个地方：类，方法，和常量
 * 文档注释是功能级注释。在类上使用是用来说明当时类的设计意图和整体功能。
 * @author
 */
public class Demo {
    /**
     * 为指定的用户添加问候语
     * @param name 指定用户的名字
     * @return  含有问候语的额字符串
     * */
  public String sayHello(String name){
      return "你好"+name;
  }

    /**
     * sayhello中用到的问候
     */
  public static final String INFO="你好";
}
