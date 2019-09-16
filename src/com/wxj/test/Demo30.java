package com.wxj.test;

import java.util.ArrayList;
/*
 * 
 * dfs 常见例题  部分 和  其实本质上就是选这个位置 和不选  两种情况 两种平行状态 直接用递归就行 
 * 不用在循环中 递归
 */
public class Demo30 {

	public static void main(String[] args) {
		int [] a = {1,2,4,7,42,123,453,32};
		int k = 55;
		//方法一
		dfsToSum(a,k,0,new ArrayList<Integer>());
		// 所有的有两种情况的问题 即取不取  即二叉树的情况 实际上就是一个子集问题
//		for(int i = (int) Math.pow(2,a.length) ; i > 0 ;i--) {
//			int []  temp = new int [a.length];
//			int count = 0 ;
//			for(int j = a.length -1 ; j >=0 ;j--) {
//				if(((i>>j)&1) ==1) {
//				
//					temp[count] = a[count];
//				}
//				else {
//					
//					temp[count] = 0;
//				}
//				
//				count++;
//			}
//			
//			int sum = 0 ;
//			for(int x = 0 ; x < count ;x++)
//			{
//				sum+=temp[x];
//			}
//			if(sum == k) {
//			for(int x = 0 ; x < count ;x++)
//			{	
//				if(temp[x] != 0)
//				{
//				System.out.print(temp[x]+" ");
//				}
//			}
//				break;
//			}
//		}

	}
	private static void dfsToSum(int [] a,int k,int cur,ArrayList<Integer> alist) {
		if(k == 0) {
			System.out.println(alist);
			System.exit(0);
		}
		else if(k < 0 || cur == a.length) {
			return ;
		}
		dfsToSum(a,k,cur+1,alist);
		int index = alist.size();
		alist.add(a[cur]);
		dfsToSum(a,k-a[cur],cur+1,alist);
		alist.remove(index);
	}
} 
