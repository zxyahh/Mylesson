package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cs = new char[] {'a','b','c'};
		String str2 = new String(cs);
		System.out.println(str2);
		char[] cs2 = str2.toCharArray();
		for (char c : cs2) {
			System.out.println(c);
		} 
		System.out.println(str2.charAt(1));
		System.out.println(str2.length());
		String str3 = "  myxq ha  adf dfa;df;dd  ";
		str3 = str3.trim();
		System.out.println(str3);
		String newstr = str3.replace(";","aaa");
		System.out.println(newstr);
		newstr = newstr.replaceAll(" ", "");
		System.out.println(newstr);
		Random r =new Random();
		System.out.println(r.nextInt(200));
//		System.out.println(r.nextBoolean());
//		System.out.println(r.nextDouble());
//		Random r2 = new Random(10);
//		System.err.println(r2.nextInt());
		
		
	}
	

}
