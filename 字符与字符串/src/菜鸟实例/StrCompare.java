package 菜鸟实例;
/**
 * 字符串的比较
 * compareTo():从字符串的第一个字符开始比较,找到第一个不同的字符，计算他们的阿斯克码对应数值的差值返回这个差值，后面的字符不做比较
 * compareToIgnoreCase（）：与compareTo()不同的是，它不做大小写区分
 * @author me
 *
 */
public class StrCompare {
	public static void main(String[] args) {
		String str = "hellow word";
		String str2 = "Hellow Word";
		Object objstr = str;
		
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareToIgnoreCase(str2));
		System.out.println(str.compareTo(objstr.toString()));
	}
}
