package test;
/*
*  要求用户在控制台输入自己的用户名。
 * 然后要求做如下验证工作:
 * 1:用户名不能为空(只要有一个字符)
 * 2:用户名必须在20个字以内
*
* */
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<=10;i++){
        System.out.println("请输入你的用户名：");
        String name=scan.nextLine();
        if(name.length()>=0 && name.length()<=20){
            System.out.println("通过");
        }else{
            System.out.println("不通过");
        }
        }
    }
}
