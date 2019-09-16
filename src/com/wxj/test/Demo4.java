package com.wxj.test;

public class Demo4 
{
	public static void main(String [] args)
	{
		/*
		 * Nim游戏：经典数学问题  一共有N堆石子 编号 1 - N 第i堆石子有a[i]个石子
		 * 即每堆石子数量任意 现在Alice 和Bob一次可以从一堆中取出任意数量的石子
		 * 问现在Alice 先手 若两人都采取最优策略谁会赢
		 *  
		 */
		/*
		 * 思路 Nim 研究发现 把这N堆石子的数量取一个^ 若为0 则不论怎么取都会变成
		 * 不为0  若不为0 则总有办法 取出一堆中 一定数量的石子让异或的结果为0
		 */
		int [] a = {2,3,5};
		boolean flag = solve(a);
		if(flag == true)
		{
			System.out.print("Alice Win");
		}
		else
		{
			System.out.print("Bob Win");
		}
		
	}

	private static boolean solve(int[] a) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int i = 0 ; i < a.length ;i++)
		{
			temp ^= a[i];
		}
		return temp != 0;
	}

}
