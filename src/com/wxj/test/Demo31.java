package com.wxj.test;

import java.util.Scanner;

/*
 * 水洼数   实际上 就是 用dfs 思想 找与自己联通的八个方向的水洼 并把他们变成.  因为只关心是否有水洼
 * 所以不存在误删的情况
 */
public class Demo31 {
	static int n;
	static int m;
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	 m = sc.nextInt();
	char [][] a = new char [n][];
	for(int i = 0 ; i < n ;i++)
	{
		a[i] = sc.next().toCharArray();
	}
	int cnt = 0;
	for(int i = 0 ; i < n;i++) {
		for(int j = 0 ; j < m ;j++) {
			if(a[i][j]=='W') {
				dfs(a,i,j);
				cnt++;
			}
		}
	}
	System.out.println(cnt);
  }

private static void dfs(char[][] a, int i, int j) {
	// TODO Auto-generated method stub
	a[i][j] = '.';
//	for(int k = -1 ; k < 2;k++) {
//		for(int l = -1;l<2;l++) {
//			if(k==0&&l==0)continue;
//			if(i+k>=0&&i+k<=n-1&&j+l>=0&&j+l<=m-1) {
//				if(a[i+k][j+l]=='W')
//					dfs(a,i+k,j+l);
//			}
//		}
//	}
	if(i > 0 && a[i-1][j]=='W')dfs(a,i-1,j);
	if(i < a.length -1&& a[i+1][j]=='W')dfs(a,i+1,j);
	if(j > 0 && a[i][j-1]=='W')dfs(a,i,j-1);
	if(j < a[0].length-1 && a[i][j+1]=='W')dfs(a,i,j+1);
	if(i > 0 && j > 0&&a[i-1][j-1]=='W')dfs(a,i-1,j-1);
	if(i > 0 && j < a[0].length -1&& a[i-1][j+1]=='W')dfs(a,i-1,j+1);	
	if(i < a.length -1 &&j >0&&a[i+1][j-1]=='W')dfs(a,i+1,j-1);
	if(i < a.length -1 && j <a[0].length -1 && a[i+1][j+1]=='W')dfs(a,i+1,j+1);
	}
}
