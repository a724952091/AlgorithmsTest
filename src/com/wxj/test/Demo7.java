package com.wxj.test;

public class Demo7 {
	static long x;
	static long y;
	//欧几里得算法 即 辗转相除法求最大公约数
	public static int gcd(int m ,int n) {
		return n==0?m:gcd(n,m%n);//即反复去用m即第一个值去对n求余 以上一次的n作为新的m
		
	}
	//欧几里得 扩展 裴蜀等式  对于任何整数  a b 和他们的最大公约数d 关于未知数x和y的丢番图方程
	//ax+by=m;有整数解时当且仅当m是d的倍数 裴蜀等式有解时必然有无穷多个整数解
	//每组解x y都称为裴组数 
	//特别的 方程 ax+by = 1 有整数解当且仅当整数a和b互素
	// 有一个重要的常识  a % b = a-(a/b)*b 
	public static void main(String [] args) {
		linearEquation(12,42,6);
		System.out.print(x+"  "+y);
	}
	//求ax+by=gcd的解
	//二元一次线性方程求法
	public static long ext_gcd(long a ,long b) {
		if(b==0) {
			x=1;
			y=0;
			return a;
		}
		long res = ext_gcd(b,a%b);
		//x，y已经被下一层递归更新了 
		long x1 = x;
		x = y;
		y = x1-a/b*y;
		return res;
	}
	public static long linearEquation(long a,long b,long m) {
		long d = ext_gcd(a,b);
		long n = m /d;
		x*=n;
		y*=n;
		return d;
	}
}
