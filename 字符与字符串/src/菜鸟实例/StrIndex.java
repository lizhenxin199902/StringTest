package ����ʵ��;

import java.util.Scanner;

/**
 * �����ַ����״γ��ֵ�λ��
 * IndexOf();
 * �����ַ��������ֵ�λ��
 * LastIndexOf();
 * @author me
 *
 */
public class StrIndex {
	public static void main(String[] args) {
		String str = "Helelow world,Hellow Runoob";
		int firstIndex = str.indexOf("lo");
		
		int lastIndex = str.lastIndexOf("lo");
		if(lastIndex==-1) {
			System.out.println("�����ڸ��ַ���");
			
			
		}else {
			System.out.println("�ַ����״γ��ֵ�λ�ã�"+firstIndex);
			System.out.println("�ַ��������ֵ�λ�ã�"+lastIndex);
		}
	
	}
}
