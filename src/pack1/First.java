package pack1;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a word");
		String str=scn.next();
		
		StringBuffer sb=new StringBuffer(str);
		System.err.println(sb.reverse());
	}

}
