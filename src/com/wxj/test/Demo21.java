package com.wxj.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * 返回某集合的所有子集
 */
public class Demo21 {
	public static void main(String [] args) {
		int [] a = {755,2,3};
		Set<Set<Integer>> set = getSubSet2(a,a.length,a.length-1);
		System.out.println(set);
	}
	private static Set<Set<Integer>> getSubSet2(int [] a,int n,int cur){
		
		Set<Set<Integer>> oldSet = new HashSet<>();
		oldSet.add(new HashSet<Integer>());
		for(int i = 0 ; i < n;i++) {
			Set<Set<Integer>> newSet = new HashSet<>();
		newSet.addAll(oldSet);
		for(Set e:oldSet) {
			Set clone = (Set) ((HashSet)e).clone();
			clone.add(a[i]);
			newSet.add(e);
			newSet.add(clone);
		}
		oldSet = newSet;
		}
		return oldSet;
	}
	
//递归写法
	private static Set<Set<Integer>> getSubSet(int[] a, int n, int cur) {
		Set<Set<Integer>> newSet = new HashSet<>();
		if(cur == 0) {
			Set<Integer> nil = new HashSet<>();
			Set<Integer> first = new HashSet<>();
			first.add(a[0]);
			newSet.add(nil);
			newSet.add(first);
			return newSet;
		}
		
		Set<Set<Integer>> oldSet = getSubSet(a,n,cur-1);
	
		for(Set<Integer> set:oldSet) {
			newSet.add(set);
			Set<Integer> clone =(Set<Integer>)((HashSet)set).clone();
			clone.add(a[cur]);
			newSet.add(clone);
		}
		return newSet;
	}

	
}
