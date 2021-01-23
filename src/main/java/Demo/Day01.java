package Demo;
import java.util.function.DoubleToIntFunction;

public class Day01 {
    public static void main(String[] args) {
        /**
         * 补码：计算机中用处理负数的一种编码规则，其编码思路是将固定位数的二进制分一半作为负数使用
         * 固定位数：采用固定长度的二进制表示数字如果int类型就是固定32位长度，计算的时候任何计算结果如果超过固定位数就自动舍弃多出的位
         * 由于int类型和long位数比较长这里采用固定4位位例子研究负数的编码
         * */
        int a=0b0111_0010_0010_0101_1001_0001_0010_1111;
        System.out.println(Integer.toBinaryString(a));
        int b=0x7225912f;
        System.out.println(Integer.toBinaryString(b));
        System.out.println();
        int c=0b10101101110001101101010111100110;
        int d=0xadc6d5e6;
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(d));
        System.out.println();
        int e=0b1110_1010_0110_1111_1101_1001_1100_0111;
        System.out.println(Integer.toBinaryString(e));
        int f=0xea6fd9c7;
        System.out.println(Integer.toBinaryString(f));
        System.out.println();
        int g=-8;
        System.out.println(Integer.toBinaryString(g));

}



    }

