package com.wxj.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * 打印n对括号的全部有效集合
 */
public class Demo20 {
	public static void main(String [] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Set<String> set = print_problem2(n);
		System.out.println(set);
		String str = new String();
	
	}
//迭代方式
	private static Set<String> print_problem(int n) {
		// TODO Auto-generated method stub
		Set<String>set = new HashSet<>();
		set.add("()");
		if(n==1) {
			return set;
		}
		for(int i = 2 ; i<= n;i++) {
		Set<String> set1 = new HashSet<>();
		for(String str:set) {
			set1.add("()"+str);
			set1.add(str+"()");
			set1.add("("+str+")");
		}
		set = set1;
		}
		return set;
	}
	// 递归方式
	private static Set<String> print_problem2(int n){
		Set<String> set = new HashSet<>();
		
		if(n==1) {
			set.add("()");
			return set;
		}
		Set<String> set_n_1 = print_problem2(n-1);
		for(String str:set_n_1) {
			set.add(str+"()");
			set.add("()"+str);
			set.add("("+str+")");
		}
		return set;
	}
}
