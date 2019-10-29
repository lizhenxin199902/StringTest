package 菜鸟实例;
/**
 * 删除字符串中的一个字符
 * 自定义一个方法，传入原始字符串和需要移除的字符在该字符串中的位置
 * 在自定义方法中借助substring方法截断字符串再进行拼接，返回新字符串
 */
public class StrRemove {
	public static void main(String[] args) {
		String str = "this is java";
		System.out.println(removeChar(str, 3));
	}
	public static String removeChar(String s, int pos) {
		return s.substring(0,pos)+s.substring(pos+1);
	}
}
