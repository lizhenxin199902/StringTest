package ����ʵ��;
/**
 * �ַ����ķ�ת
 * StringBuffer().reverse()
 * ���ַ���ת��ΪStringBuffer�࣬����StringBuffer��reverse���������ַ����з�ת������tostring�����������ַ���
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
