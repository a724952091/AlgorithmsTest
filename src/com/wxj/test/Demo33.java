package com.wxj.test;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 输入正整数n，对1-n进行排列，使得相邻两个数之和均为素数，
 * 输出时从整数1开始，逆时针排列。同一个环应恰好输出一次
 * n<=16
 * 如输入6
 * 输出：
 * 1 4 3 2 5 6
 * 1 6 5 2 3 4
 */
public class Demo33 {
	
	static int cur = 0;
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int [] a = new int [n];
		a[0] =1;
		dfs(a,n,1);
		
	}
	public static void dfs(int [] a,int n,int cur) {
		if(cur == n && isP(a[n-1]+a[0])) {
			for(int i = 0 ; i < n;i++) {
				System.out.print(a[i]);
			}
			System.out.println();
			return ;
		}
		for(int i = 2 ; i <= n ;i++) {
			if(check(a,cur,i)) {
				
				a[cur] = i;
				dfs(a,n,cur+1);
				a[cur] = 0;
			}
			
		}
		
	}
	private static boolean isP(int i) {	
		for(int j= 2 ; j < i ;j++) {
			if(i % j ==0)
			{
				return false;
			}
		}
		
		return true;
	}
	private static boolean check(int[] a, int cur, int i) {
		
		for(int j = 0 ; j < cur ;j++) {
			if(a[j] == i) {
				return false;
			}
			
			if(cur < a.length-1&&!isP(i+a[cur-1])) {
				return false;
			}
		}
		return true;
	}
}

