package com.wxj.test;

public class Demo25 {
	public static void main(String[] args) {
		int n = 10;
		HannuoTower.moveDish(n, 'a', 'b', 'c');
	}
}
class HannuoTower{
	public  static void moveDish(int n,char a,char b, char c) {
		if(n == 1) {
			System.out.println("把第"+n+"个盘子从"+a+"移动到"+c+"    ");
			
		}
		else {
		moveDish(n-1,a,c,b);
		System.out.println("把第"+n+"个盘子从"+a+"移动到"+c);
		moveDish(n-1,b,a,c);
		}
	}
}