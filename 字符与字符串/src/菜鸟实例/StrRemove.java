package ����ʵ��;
/**
 * ɾ���ַ����е�һ���ַ�
 * �Զ���һ������������ԭʼ�ַ�������Ҫ�Ƴ����ַ��ڸ��ַ����е�λ��
 * ���Զ��巽���н���substring�����ض��ַ����ٽ���ƴ�ӣ��������ַ���
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
