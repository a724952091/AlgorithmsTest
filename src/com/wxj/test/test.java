package com.wxj.test;

public class test {

public static void main(String[] args) {
	int sum = add(100);
	System.out.println(sum);
}
	public static int add(int max) {
	if(max ==1) {
		return 1;
	}
	return max+add(max-1);
	}
}
