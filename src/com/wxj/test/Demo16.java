package com.wxj.test;

import java.util.Scanner;

public class Demo16 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		for(int i = 0 ; i  < t ;i ++) {
		int num ;
		num = sc.nextInt();
		int type1Num = 0;
		int type2Num = 0;
		int type3Num = 0;
		String str;
		int min = 0;
		for(int j = 0 ; j < num ;j++)
		{
			str = sc.next();
			str = str.substring(0,3);
			if(str.contains("bed"))
			{
			
				type1Num++;
			}
			else if(str.contains("kit")) {
			
				type2Num++;
			}
			else if(str.contains("liv")) {
			
				type3Num++;
			}
			
		}
		type1Num/=2;
		min = type1Num;
		if(min > type2Num) {
			min = type2Num;
		}
		if(min > type3Num) {
			min = type3Num;
		}
		System.out.println(min);
		
		
		
		}
	
	}
	
	

}
