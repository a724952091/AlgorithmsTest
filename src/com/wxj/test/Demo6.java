package com.wxj.test;

import java.util.Scanner;

public class Demo6 
{
	public static void main(String [] args)
	{
		/*
		 * 阶梯Nim博弈问题
		 * nim游戏
		 */
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int res = 0;
		int [] a = new int [n];
		for(int i = 0 ; i < n ;i++)
		{
			a[i] = sc.nextInt();
		}
		if(n % 2 == 1)
		{
		for(int i = 0 ; i < n ; i++)
		{
			res ^= (i==0)?(a[0]-1):(a[i]-a[i-1]-1);
		}
		}
		else
		{	
		for(int i = 1 ; i < n ;i++)
		{
			res ^= (a[i]-a[i-1]-1);
		}
		}
		if(res == 0)
		{
			System.out.print("Bob Will Win");
		}
		else
		{
			System.out.print("Alice Will Win");
		}
	}

}
