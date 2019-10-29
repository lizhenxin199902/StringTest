package 菜鸟实例;
/**
 * 替换字符串
 * replace（a,b）：指定要替换的字符串，替换后产生的是新字符串，不改变原字符串
 * @author me
 *
 */
public class StringReplaceEXP {
	public static void main(String[] args) {
		String str  ="Hellow world";
		System.out.println(str.replace('H', 'W'));
		System.out.println(str.replaceFirst("He", "wa"));
		System.out.println(str.replaceAll("He", "Ha"));
		System.out.println(str);
	}
}
