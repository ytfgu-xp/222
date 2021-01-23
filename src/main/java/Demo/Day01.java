package Demo;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.Random;
import java.util.function.DoubleToIntFunction;

public class Day01 {
    public static void main(String[] args) {
        /**
         * 补码：计算机中用处理负数的一种编码规则，其编码思路是将固定位数的二进制分一半作为负数使用
         * 固定位数：采用固定长度的二进制表示数字如果int类型就是固定32位长度，计算的时候任何计算结果如果超过固定位数就自动舍弃多出的位
         * 由于int类型和long位数比较长这里采用固定4位位例子研究负数的编码
         * */
//        int a=0b0111_0010_0010_0101_1001_0001_0010_1111;
//        System.out.println(Integer.toBinaryString(a));
//        int b=0x7225912f;
//        System.out.println(Integer.toBinaryString(b));
//        System.out.println();
//        int c=0b10101101110001101101010111100110;
//        int d=0xadc6d5e6;
//        System.out.println(Integer.toBinaryString(c));
//        System.out.println(Integer.toBinaryString(d));
//        System.out.println();
//        int e=0b1110_1010_0110_1111_1101_1001_1100_0111;
//        System.out.println(Integer.toBinaryString(e));
//        int f=0xea6fd9c7;
//        System.out.println(Integer.toBinaryString(f));
//        System.out.println();
//        int g=-8;
//        System.out.println(Integer.toBinaryString(g));
        /**
         * 补码编码规律
         * 最大值：0+n个1
         * int类型最大值：0+31个1
         * long类型最大值：0+63个1
         * 最小值:1+n个0
         * int类型最小值：1+31个0
         * long类型最小值：1+63个0
         * */
//        int max=Integer.MAX_VALUE;
//        int min=Integer.MIN_VALUE;
//        long lmax=Long.MAX_VALUE;
//        long lmin=Long.MIN_VALUE;
//        System.out.println(Integer.toBinaryString(max));//int类型最大值
//        System.out.println(Integer.toBinaryString(min));//int类型最小值
//        System.out.println(Long.toBinaryString(lmax));//long类型最大值
//        System.out.println(Long.toBinaryString(lmin));//long类型最小值
//        int i=-1;
//        long l=-1L;
//        System.out.println(Integer.toBinaryString(i));
//        System.out.println(Long.toBinaryString(l));
//        Random ran=new Random();
//
//        for(int k=1;k<=10;k++){
//            int a=(int)(Math.random()*100+1);
//            int b=(int)(Math.random()*100+1);
//            System.out.println("算吧");
//            System.out.println(a+"+"+b);
//        }
        int n=10;
        int m=~n;
        System.out.println(n);
        System.out.println(m);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        int k=0x5dad2641;
        int l=0x6cedf533;
        int j=k&l;
        System.out.println(Integer.toBinaryString(k));
        System.out.println(Integer.toBinaryString(l));
        System.out.println(Integer.toBinaryString(j));
        System.out.println();
        int n1=0x77c270bd;
        int n2=n1>>>1;
        int n3=n1>>>2;
        int n4=n1>>>8;
        int n5=(n1>>>8)&0xff;
        System.out.println(Integer.toBinaryString(n1));
        System.out.println(Integer.toBinaryString(n2));
        System.out.println(Integer.toBinaryString(n3));
        System.out.println(Integer.toBinaryString(n4));
        System.out.println(Integer.toBinaryString(n5));

}
    }

