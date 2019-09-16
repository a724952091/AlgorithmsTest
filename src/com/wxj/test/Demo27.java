package com.wxj.test;

import java.util.Scanner;

/*
 * 找出按字典序排的第k个排列
 */
public class Demo27 {
	private static int count = 0;
	private static int k;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		char [] arr = {'a','b','c'};
		Permatution(arr,"");
	}
	public static void Permatution(char [] ch ,String str) {
		if(str.length() == ch.length)
		{
			count++;
			if(count ==k) {
				System.out.println(str);
				System.exit(0);
			}
		}
		for(int i = 0 ; i < ch.length ;i++) {
			char temp = ch[i];
			if(count(ch,temp) > count(str,temp))
			{
				Permatution(ch,str+temp);
			}
		}
	}
	private static int count(char[] arr, char ch) {

		int sum = 0;
		for(int i = 0 ; i < arr .length ;i++) {
			if(arr[i] == ch)
			{
				sum++;
			}
		}
		return sum;
	}
	private static int count(String str, char ch) {
		char [] temp = str.toCharArray();
		int sum = 0;
		for(int i = 0 ;i < temp.length ;i++)
		{
			if(temp[i] == ch)
			{
				sum++;
			}
		}
		return sum;
	}
}
