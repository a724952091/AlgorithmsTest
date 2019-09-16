package com.wxj.test;
/*
 * 
 * M * N的方格，一个机器人从左上走到右下，只能向右或向下走。
 * 有多少种不同的走法？由于方法数量可能很大，只需要输出Mod 10^9 + 7的结果。
 */
import java.util.Scanner;

public class Demo13 
{
	public static void main(String [] args) {
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println(solve(x,y));
		
	}
	public static int solve(int x,int y) {
		if(x==1||y==1) {
			return 1;
		}
		return solve(x-1,y)+solve(x,y-1)%((int)Math.pow(10, 9)+7);
	}

}
