package how2j;

public class Test {
	public static void main(String[] args) {
        System.out.println(Math.E);             //通过运算工具类得出的自然对数
         
        int i = Integer.MAX_VALUE;              //int的最大值
        System.out.println(Math.pow(1+1d/i,i)); //计算出自然对数
         
        long l = Long.MAX_VALUE;                //long的最大值
        System.out.println(Math.pow(1+1d/l, l));//计算出自然对数（精度过大）
    }
}
