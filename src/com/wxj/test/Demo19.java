package com.wxj.test;

import java.util.Scanner;

public class Demo19 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int [] arr = new int [4];
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 10;
		arr[3] = 25;
		int res = coutWays(arr,n,3);
		System.out.println(res);
	}
	public  static  int coutWays(int [] arr,int n, int cur) {
		if(cur == 0) {
			return 1;
		}
		int res = 0;
		for(int i = 0 ; i <=  n/arr[cur];i++) {
			int residue = n - i* arr[cur];
			res+=coutWays(arr,residue,cur-1);
		}
		return res;
	}
}
