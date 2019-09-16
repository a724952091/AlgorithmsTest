package com.wxj.test;

/*
 * 约瑟夫环的数组解法
 */

public class Demo3 {
	 
    public static void main(String[] args) {
        
        int m=501;             
        int n = 3;                    
        int[] a = new int[m+1];                      
        for(int i=1;i<m;i++) {                       
            a[i]=i;
        }
         
        int count = 500;
        int j = 1;
         int i = 0;
        while(count!=0) {
             
            while(a[i] == 0)
            {
            	i++;
            	if(i == m+1)
            	{
            		i = 0;
            	}
            }
            if(j==3)
            {
            	System.out.println(a[i]);
            	a[i] = 0;
            	count--;
            	j=0;
            }
            j++;
            i++;
            if(i == m+1)
        	{
        		i = 0;
        	} 
      
        }
    }
     
   
 
}