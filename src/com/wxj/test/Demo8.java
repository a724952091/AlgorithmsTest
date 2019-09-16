package com.wxj.test;

public class Demo8 {
//经典题目 一步之遥
	/*	一步之遥 
		从昏迷中醒来，小明发现自己被关在X星球的废矿车里。 
		矿车停在平直的废弃的轨道上。 
		他的面前是两个按钮，分别写着“F”和“B”。 
		小明突然记起来，这两个按钮可以控制矿车在轨道上前进和后退。 
		按F，会前进97米。按B会后退127米。 
		透过昏暗的灯光，小明看到自己前方1米远正好有个监控探头。 
		他必须设法使得矿车正好停在摄像头的下方，才有机会争取同伴的援助。 
		或许，通过多次操作F和B可以办到。 
		矿车上的动力已经不太足，黄色的警示灯在默默闪烁… 
		每次进行 F 或 B 操作都会消耗一定的能量。 
		小明飞快地计算，至少要多少次操作，才能把矿车准确地停在前方1米远的地方。 
		请填写为了达成目标，最少需要操作的次数。
		即 97x-127y = 1 
	 */
	
	public static void main(String[] args) {
		try {
			ExtGcd.linearEquation(97, -127, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Impossible");
		}
		long x = ExtGcd.x;
		long y = ExtGcd.y;
		System.out.println(Math.abs(x)+Math.abs(y));
	}
	private static class ExtGcd{
		//求解 ax + by = c；
		public static long x;
		public static long y;
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
		public static long linearEquation(long a,long b ,long c) throws Exception {
			long d = Ext_gcd(a,b);
			if(c % d != 0)throw new Exception("无解");
			long n = c/d;
			a*=n;
			b*=n;
			return d;
		}
	}
}
