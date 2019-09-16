package com.wxj.test;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 二进制解子集问题
 * 自己的数量 直接能推出来 2的n次方  本质上 是一个完全二叉树
 */
public class Demo22 {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		ArrayList<ArrayList<Integer>> alist = getSubSets(a,5);
		System.out.println(alist);
		
	}
	public static ArrayList<ArrayList<Integer>> getSubSets(int [] a,int n){
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		for(int i = (int)Math.pow(2, n); i > 0;i--) {
			ArrayList<Integer> ints = new ArrayList<>();
			for(int j = n -1; j >= 0 ;j--) {
				if(((i>>j)&1)==1) {   //遍历二叉树所有节点 
					ints.add(a[j]);
				}
			}
			res.add(ints);
		}
		return res;
	}
	
}
