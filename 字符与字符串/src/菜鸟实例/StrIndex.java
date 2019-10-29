package 菜鸟实例;

import java.util.Scanner;

/**
 * 查找字符串首次出现的位置
 * IndexOf();
 * 查找字符串最后出现的位置
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
			System.out.println("不存在该字符串");
			
			
		}else {
			System.out.println("字符串首次出现的位置："+firstIndex);
			System.out.println("字符串最后出现的位置："+lastIndex);
		}
	
	}
}
