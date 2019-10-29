package 菜鸟实例;
/**
 * 字符串的反转
 * StringBuffer().reverse()
 * 将字符串转换为StringBuffer类，借助StringBuffer的reverse方法将该字符序列反转，再用tostring方法返回新字符串
 * @author me
 *
 */
public class StrRevers {
	public static void main(String[] args) {
		String str = "roob";
		String reverse=new StringBuffer(str).reverse().toString();
		System.out.println(reverse);
		System.out.println(str);
	}
}
