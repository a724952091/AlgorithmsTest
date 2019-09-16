package com.wxj.test;

public class quick_sort {
	public static void main(String[] args) {
		int [] a= {432,42,31,321,53,12};
//		quick_sort(a,0,a.length-1);
		for(int i = 0 ; i < a.length ;i++) {
			System.out.println(a[i]);
		}
	}
//	public static void quick_sort(int []a,int l , int r)
//	{
//	    if(l <r)
//	    {
//	    int q = partation(a, l, r);
//	    quick_sort(a, l, q-1);
//	    quick_sort(a, q+1, r);
//	    }
//	}
	/*int partation(int a[] ,int l , int r)//三向扫描
	{
	    int temp = a[l];
	    int s = l+1;
	    int e = s;
	    int right = r;
	    while(s <= right && a[s] < temp)
	    {
	        s++;
	        e++;
	    }
	    while(s <= right)
	    {
	       
	       if(a[s] < temp)
	       {
	           swap1(a,e,s);
	           e++;
	           s++;
	       }
	        else if(a[s] == temp)
	        {
	            s++;
	        }
	        else if(a[s] > temp)
	        {
	            swap1(a,s,right);
	            right--;
	        }
	    }
	    swap1(a, l, right);
	    return right;
	}
	*/
//	public static int partation(int []a,int l, int r)//双向扫描
//	{
//	    int temp ;
//	    int mindIndex = (r+l)>>1;
//	    int mindpos = -1;
//	    if(a[l] <= a[mindIndex] && a[l] >= a[r])
//	    {
//	        mindpos = l;
//	    }
//	    else if(a[l] <= a[mindIndex] && a[mindIndex] <= a[r])
//	    {
//	        mindpos = mindIndex;
//	    }
//	    else
//	    {
//	        mindpos = r;
//	    }
//	    swap1(a, l, mindpos);
//	    temp = a[l];
//	    int scan_pos = l+1;
//	    int bigger = r;
//	    while(scan_pos <= bigger)
//	    {
//	        while(scan_pos <= bigger && a[scan_pos] <= temp)
//	        {
//	            scan_pos++;
//	        }
//	        while (scan_pos <= bigger && a[bigger] > temp)
//	        {
//	            bigger--;
//	        }
//	        if(scan_pos < bigger)
//	        {
//	        swap1(a, scan_pos, bigger);
//	        }
//	    }
//	    swap1(a, l, bigger);
//	    return bigger;
//	}
	private static  void swap1(int[] a, int l, int mindpos) {
		// TODO Auto-generated method stub
		a[l] ^= a[mindpos];
		a[mindpos] ^= a[l];
		a[l] ^=a[mindpos];
	}
	 
//	public static int partation(int a[],int l,int r)//单向扫描法
//	{
//	    int temp = a[l];
//	    int scan_pos = l+1;
//	    int bigger = r;
//	    while(scan_pos <= bigger)
//	    {
//	        if(a[scan_pos] <= temp)
//	        {
//	            scan_pos++;
//	        }
//	        else
//	        {
//	            swap1(a,scan_pos,bigger);
//	            bigger--;
//	        }
//	    }
//	    swap1(a, l,bigger);
//	    return bigger;
//	}
	
}
