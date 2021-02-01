package thread;
/**
 * 多线程
 * 多线程可以让多个代码片段并发执行，造成一种“同时”运行的现象
 * 创建多线程有两种方式
 * 方式一：继承Thread并重写run方法
 *
 * 第一种创建线程的方式优点在于结构简单，利于匿名内部类形式创建
 * 缺点两个：
 * 1.由于java是单继承的，这导致如果继承了Thread就无法再继承其他类去复用方法，实际开发中
 * 是非常不方便的
 * 2.定义线程的同时，重写了run方法，这会导致将任务直接定义在了线程中使用于任务存在必须的耦合关系不利于线程的重用
 * */
public class ThreadDemo1 {
    public static void main(String[] args) {
        //给线程初始化
        Thread t1=new MyThread();
        Thread t2=new MyThread1();
        //调用线程用start方法
        /*
        * 注意：启动线程的时候要调用线程的start方法，而不是直接调用run方法
        * 线程调用start方法后会纳入到线程调度器中，
        * 线程调度器非配cpu时间片段给当前线程使用它开业给其他线程并发运行
        * 当给线程第一次获取 时间片段时会自动执行run方法
        * */
        t1.start();
        t2.start();
    }
}
//线程1并继承
class MyThread extends Thread{
  //重写run方法
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("你猜我是谁");
        }
    }
}
//线程2并继承
class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("哈哈，我就是不猜");
        }
    }
}