package com.wxj.test;

import java.util.Scanner;

public class Demo14 
{
	public static void main(String [] args) {
		double d ;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			d = sc.nextDouble();
			if(d < 0) {
				d = 0-d;
			}
			System.out.println(String.format("%.2f",d));
		}
	}

}
