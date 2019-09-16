package com.wxj.test;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 全排列
 */
public class Demo24 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		ArrayList<String> alist =  getPermutation(a);
		System.out.println(alist);
	}

	private static ArrayList<String> getPermutation(String a) {
		ArrayList<String> list = new ArrayList<>();
		list.add(a.charAt(0)+"");
		for(int i = 1; i < a.length() ;i++) {
			char c = a.charAt(i);
			ArrayList<String> new_List = new ArrayList<>();
			for(String str:list) {
				new_List.add(str+c);
				new_List.add(c+str);
				
				for(int j = 1; j < str.length();j++)
				{
					String temp = str.substring(0,j) + c+str.substring(j);
					new_List.add(temp);
				}
			}
			list = new_List;
		}
		return list;
	}
}
