package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * JDK之后推出了一个新的特性：lambda表达式
 * lambda表达式可以用更简短的语法创建匿名内部类
 * 语法：
 * （参数列表）->{
 *     方法体
 * }
 * 需要注意：使用lambda表达式创建实现的接口中只能有一个抽象方法
 * */
public class LambdaDemo1 {
  FileFilter filter=(File file)->{
    return file.getName().contains("e");
  };
  //参数类型可以忽略不写
  FileFilter filter1=(file)->{
    return file.getName().contains("e");
  };
  /*  当方法中只有一句代码那么方法体的{}可以忽略不写
  * 并且如果该方法要求返回值，则return关键字也要一同忽略
  * */
    FileFilter filter3=(file)->file.getName().contains("e");

  /*
  * 编译器会结合程序语义分析出实现的哪个结构，由于要求接口只能有一个抽象方法
  * 所有也能知道重写的方法时什么
  * 最终将它还原为匿名内部类
  * */
}
