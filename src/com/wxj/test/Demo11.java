package com.wxj.test;

import java.util.Scanner;

/*
 * 两只青蛙在网上相识了，它们聊得很开心，
 * 于是觉得很有必要见一面。它们很高兴地发现它们住在同一条纬度线上，
 * 于是它们约定各自朝西跳，直到碰面为止。可是它们出发之前忘记了一件很重要的事情，
 * 既没有问清楚对方的特征，也没有约定见面的具体位置。不过青蛙们都是很乐观的，
 * 它们觉得只要一直朝着某个方向跳下去，总能碰到对方的。
 * 但是除非这两只青蛙在同一时间跳到同一点上，不然是永远都不可能碰面的。
 * 为了帮助这两只乐观的青蛙，你被要求写一个程序来判断这两只青蛙
 * 是否能够碰面，会在什么时候碰面。 
 *我们把这两只青蛙分别叫做青蛙A和青蛙B，并且规定纬度线上东经0度处为原点，
 *由东往西为正方向，单位长度1米，这样我们就得到了一条首尾相接的数轴。
 *设青蛙A的出发点坐标是x，青蛙B的出发点坐标是y。青蛙A一次能跳m米，
 *青蛙B一次能跳n米，两只青蛙跳一次所花费的时间相同。纬度线总长L米。
 *现在要你求出它们跳了几次以后才会碰面。
 *输入只包括一行5个整数x，y，m，n，L，其中x≠y < 2000000000，0 < m、n < 2000000000，0 < L < 2100000000。
 *输出碰面所需要的跳跃次数，如果永远不可能碰面则输出一行"Impossible"
 */
 public class Demo11 {
	public static long x1= 0 , y1=0;
	public static void main(String [] args) {
	 Scanner sc = new Scanner(System.in);
	 long x = sc.nextInt();
	 long y = sc.nextInt();
	 long m = sc.nextInt();
	 long n = sc.nextInt();
	 long l = sc.nextInt();
	 
	 
	 long a = m-n;
	 long b = l;
	 m = y-x;
	 long d = 0;
	 try {
	 d = LinearEquation(a,b,m);
		long x0 = x1;
		while(x0 < 0)
		{
			x0+=Math.abs(b/d);
		}
		//b/=d;
		//b=Math.abs(b);
		//x0 = (x0 % b +b) % b;
		System.out.println(x0);
		} catch (Exception e) {
		System.out.println("Impossible");
	}
 }
 public static long Ext_gcd(long a,long b)
 {
	 if(b==0)
	 {
		 x1 = 1;
		 y1 = 0;
		 return a ;
	 }
	 long res = Ext_gcd(b,a%b);
	 long x2 = x1;
	 x1 = y1;
	 y1 = x2 - a/b*y1;
	 return res;
 }
 public static long LinearEquation(long a,long b,long c) throws Exception
 {
	 long d = Ext_gcd(a,b);
	 if(c % d !=0) {
		 throw new Exception("无解");
	 }
	 long n = c/d;
	 x1*=n;
	 y1*=n;
	 return d;
 }
}
