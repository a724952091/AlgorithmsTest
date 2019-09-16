package com.wxj.test;

import java.util.Scanner;

/*
 * ax % n =1  这样的方程叫做 同余方程 可以转换成  ax  = 1+ ny   
 * (y表示的是倍数 即ax 除以了几个n 余1） 这样 本题就转换成了 求
 * ax+ny = 1 这个二元线性方程 
 * 
 */
/*
 * 要求(A/B)%9973，但由于A很大，我们只给出n(n=A%9973)(我们给定的A必能被B整除，
 * 且gcd(B,9973) = 1)。 看到 gcd（a，n） = 1 时就要知道 a 和n 互 余 
 * 即 ax % n =1有解
		Input
		数据的第一行是一个T，表示有T组数据。
		每组数据有两个数n(0 <= n < 9973)和B(1 <= B <= 10^9)。
 
		Output
		对应每组数据输出(A/B)%9973。
		根据题意 B % 9973 =1 则 bx %9973 =1  即b 和x 对9973求余互为相反数
		即所谓的互余 所以题目就变成了 a* x %9973 乘法可以交换 
		即x * a % 9973 而 a%9973 就是题目中给的  n 这个题目只需要求出x即可
 */
public class Demo12 {
	public static long  x,y;
	public static void main(String [] args) {
		int T;
		long b;
		long n;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int i = 0 ; i < T ;i++) {
			b = sc.nextInt();
			n = sc.nextInt();
			long temp = inverseElement(b,9973);
			System.out.println(x*n%9973);
		}
	}
	public static long inverseElement(long a,long m) {
		long d = linearEquation(a, m, 1);
			x = (x%m +m)%m;//保证解为大于0的数
			return d; 
		
				
		
		
	}
	public static long Ext_gcd(long a,long b) {
		if(b == 0) {
			x = 1;
			y = 0;
			return a;
		}
		long res = Ext_gcd(b,a%b);
		long temp = x;
		x = y;
		y = temp - a/b*y;
		return res;
	}
	public static long linearEquation(long a,long b ,long c)  {
		long d = Ext_gcd(a,b);
		if(c % d != 0);
		long n = c/d;
		a*=n;
		b*=n;
		return d;
	}
}
