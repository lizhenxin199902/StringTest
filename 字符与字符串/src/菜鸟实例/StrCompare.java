package ����ʵ��;
/**
 * �ַ����ıȽ�
 * compareTo():���ַ����ĵ�һ���ַ���ʼ�Ƚ�,�ҵ���һ����ͬ���ַ����������ǵİ�˹�����Ӧ��ֵ�Ĳ�ֵ���������ֵ��������ַ������Ƚ�
 * compareToIgnoreCase��������compareTo()��ͬ���ǣ���������Сд����
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
