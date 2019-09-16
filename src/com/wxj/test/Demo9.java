package com.wxj.test;

import java.lang.reflect.Array;

public class Demo9 
{
	public static void main(String [] args) {
		
		int [] a = {31,452,314,412,531,41};
		quick_sort(a,0,5);
		for(int i = 0 ; i < a.length ;i++) {
			System.out.println(a[i]);
		}
	}
	public static void quick_sort(int [] array,int l,int r) {
		if(l < r)
		{
		int d = partation(array,l,r);
		quick_sort(array,l,d-1);
		quick_sort(array,d+1,r);
		}
		
	}
	public static void swap(int [] array,int l,int r)
	{
		int temp = array[l];
		array[l] = array[r];
		array[r] = temp;
	}
	private static int partation(int[] array, int l, int r) {
		// TODO Auto-generated method stub
		int temp ;
		int minIndex = (l+r)>>1;
		int minPos = -1;
		if(array[l] <= array[minIndex] && array[l] >= array[r]) {
			minPos = l;
		}
		else if(array[l] >= array[minIndex] && array[minIndex] <= array[r]) {
			minPos = minIndex;
		}
		else {
			minPos = r;
		}
		temp = array[minPos];
		swap(array,l,minPos);
		int scan_pos = l+1;
		int bigger = r;
		while(scan_pos <= bigger) {
			while(scan_pos <= bigger && array[scan_pos] <= temp) {
				scan_pos++;
			}
			while(scan_pos <= bigger && array[bigger] > temp) {
				bigger--;
			}
			if(scan_pos <= bigger)
			{
				swap(array,scan_pos,bigger);
			}
		}
		swap(array,l,bigger);
		return bigger;
	}

}
