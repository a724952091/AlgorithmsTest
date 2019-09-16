package com.wxj.test;

import java.util.Scanner;

public class Demo15 {
	public static void main(String [] args) {
		int M;
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		
		for(int i = 0; i < M ;i++) {
			boolean flag = true;
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			if(a + b <= c || a + c <= b || b+c <= a|| a < 0||b < 0||c < 0) {
				flag = false;
			}
			if(flag == true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
	}
}
