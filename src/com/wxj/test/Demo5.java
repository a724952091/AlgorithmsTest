package com.wxj.test;

public class Demo5
{
	/*
	 * 汉诺塔问题 
	 */
	/*
	 * 思路 ： 要想明白 步骤 若三个底座分别为 c d e 要从 c移动到 e首先想出口 出口就是 当要把第一个盘子移动e的位置时结束
	 *  其次想关系 即要把第n个盘移动到e 首先要想办法 把 第n-1个盘移动到 e上 
	 *  至于怎么去把第n-1个盘移动到d上 交给递归去做 第n-1个盘移动完了之后  把第n个盘
	 *  移动到e上 也就表示第n个盘移动完毕 再想办法把第n-1个盘从 d 移动到 e上 
	 *  
	 */
	public static void main(String [] args)
	{
		hannuota(3,'A','B','C');
	}

	private static void hannuota(int i, char c, char d, char e) {
		if(i == 1)
		{
			System.out.println("把第"+i+"个盘从"+c+"移动到"+e);
			return ;
		}
		hannuota(i-1,c,e,d);
		System.out.println("把第"+i+"个盘从"+c+"移动到"+e);
		hannuota(i-1,d,c,e);
		
	}

}
