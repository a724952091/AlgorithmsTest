package com.wxj.test;

import java.util.Scanner;


class listaa 
{
	int num;
	listaa next;
}
/*
 * 约瑟夫环的链表解法
 */
public class Demo2 {
	 
    public static void main(String[] args) {
    	listaa [] list  = new listaa[501];
    	for(int i = 1 ; i <= 500 ;i++)
    	{
    		list[i] = new listaa();
    	}
    	for(int i = 1 ; i < 500 ;i++)
    	{
    		list[i].num = i;
    		list[i].next = list[i+1];
    	}
    	list[500].num = 500;
    	list[500].next = list[1];
    	int count = 500;
    	listaa temp = list[1];
    	int j = 1 ;
    	while(count != 0)
    	{
    		while(temp.num == 0)
    		{
    			temp = temp.next;
    		}
    		if(j == 3)
    		{
    			System.out.println(temp.num);
    			temp.num = 0;
    			j=0;
    			count--;
    		}
    		j++;
    		temp = temp.next;
    		
    	}
      
    }
       
}