package com.wxj.test;

import java.util.Scanner;

public class Demo17 {
	static int num = 0;
	static int [] [] dp = new int[200][200];
	static int [] [] sum = new int[200][200];
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i = 1 ;i <= N;i++) {
			sum[i][i] = sc.nextInt();
			dp[i][i] = 0;
		}
		for(int len=1;len<N;len++){//区间长度 
			for(int i=1;i<=N&&i+len<=N;i++){//区间起点 
				int j=i+len;//区间终点
				for(int k=i;k<=j;k++)//用k来表示分割区间 
				{
					sum[i][j]=sum[i][k]+sum[k+1][j];
					dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k+1][j]+sum[i][j]);
				 } 
			}
		}
		for(int i = 0 ; i <= N ;i++) {
			System.out.println(dp[1][i]);
		}
//		System.out.println(dp[1][N]);
		
		
	}
	
}

