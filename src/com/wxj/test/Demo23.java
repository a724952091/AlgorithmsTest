package com.wxj.test;

import java.util.Scanner;

public class Demo23 {
	public static void main(String[] args) {
		// 遍历一个有n层的二叉树的所有节点 用二进制表示
		int n;
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		for(int i = (int)Math.pow(2, n) ;i > 0 ;i--) {
			for(int j = n-1 ;j>=0;j--) {
				System.out.print(((i>>j)&1)+" ");
			}
			System.out.println();
		}
	}
}
