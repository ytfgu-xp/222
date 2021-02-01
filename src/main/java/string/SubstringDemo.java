package string;
/**
 * String substring(int start,int end)
 * 截取指定范围内的字符串两个参数分别是范围对应的下标
 * 注意在java api中通常使用两个数字表示范围时都是含头不含尾的
 * */
public class SubstringDemo {
    public static void main(String[] args) {
        String host="www.tedu.cn";
        //截取域名
        String sub=host.substring(4,8);
        System.out.println(sub);
        //重载的substring传入一个参数为：从指定位置截取道字符串末尾
        sub=host.substring(4);
        System.out.println(sub);
        String str="www.baidu.com";
        String str1=str.substring(4,7);//是从第4个小标开始包含4 7是从第七个结束但不包含7（含头不含尾）
        System.out.println(str1);


    }
}
