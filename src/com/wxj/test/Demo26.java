package com.wxj.test;

import java.util.ArrayList;

/*
 * 全排列 回溯思想
 * !!!多路递归用循环加递归 一些情况要伴随回溯
 */
public class Demo26 {
	static ArrayList<String> res = new ArrayList<>();
	public static void main(String[] args) {
		char [] arr= {'a','b','c'};
		getPermutationCore(arr,0);
		System.out.println(res);
	}
	public static void getPermutationCore(char [] arr ,int k) {
		if(k == arr.length) {
			res.add(new String(arr));
		}
		for(int i = k ; i < arr.length ;i++) {
			swap(arr,k,i);
			getPermutationCore(arr,k+1);
			swap(arr,i,k);
		}
	}
	private static void swap(char[] arr, int k, int i) {
		// TODO Auto-generated method stub
		char temp = arr[k];
		arr[k] = arr[i];
		arr[i] = temp;
	}
}

