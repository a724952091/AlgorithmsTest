package com.wxj.test;

import java.util.Scanner;

/*
 * 模线性方程 即 ax  与 b 同余（对m求余） 对于求未知数x有解 当且仅当b是gcd（a，n）的倍数
 * 且方程有解时  方程有 gcd（a，n）个解 ax % n = 余数  = b % n;
 * ax = ny1+ 余数   b = ny2 +余数  所以可以转换成 ax+ny = b;
 * 只要 b是 a n 的 公约数 这个题目就会有解
 */
public class Demo10 {

	public static int x,y;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int m;
		a = sc.nextInt();
		b = sc.nextInt();
		m = sc.nextInt();
		if(a/m % b ==0&&a%b==0)
		{
			LinearEquation(a,a/m,b);
			System.out.print((b-a/m*y)/a);
		}
		else {
			System.out.print("无解");
		}
		
	}
	private static int Ext_gcd(int a,int n) {
		if(n==0)
		{
			x = 1;
			y = 0;
			return a;
		}
		int res = Ext_gcd(n,a%n);
		int x1 = x;
		x = y;
		y = x1 - a/n*y;
		return res;
	}
	private static int LinearEquation(int a,int n,int b)
	{
		int d = Ext_gcd(a,n);
		int m = b/d;
		x*=m;
		y*=m;
		return d;
	}
}

