package ����ʵ��;
/**
 * �滻�ַ���
 * replace��a,b����ָ��Ҫ�滻���ַ������滻������������ַ��������ı�ԭ�ַ���
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
