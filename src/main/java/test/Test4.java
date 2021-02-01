package test;
/*
*
* 代码要实现的功能:要求用户输入一个网址，格式如:
 * www.baidu.com
 * 然后判断根据域名判断是百度(baidu)或者达内(tedu)或其他
 * 然后输出判断结果*/
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner org=new Scanner(System.in);
        for(int i=0;i<=10;i++){
        System.out.println("请输入一个正确的网址：");
        String name=org.nextLine();
        int start=name.indexOf(".")+1;//找到第一个点的下标因为要从.后面开始截取，所以下标要+1
        int end=name.indexOf(".",start);//这个是从第一个点后面开始找后面一个点的位置，是从start位置开始找的
        String res=name.substring(start,end);//这个是截取从开始.到结束.后的那串字符
        if(res.equals("baidu")){//然后判断两个.之间的内容是否为给定的内容，然后返回对应的结果
            System.out.println("这是百度网站");
        }else if(res.equals("tieba")){
            System.out.println("这是贴吧网站");
        }else{
            System.out.println("这是其他网站");
        }
        }
    }
}
