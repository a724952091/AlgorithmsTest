package com.wxj.test;
/*
 * n皇后问题
 */
public class Demo32 {
	public static int count;
	public static void main(String[] args) {
		int n = 8;
		int [] [] rec = new int [n][n];
		
		dfsSolveNQueen(rec, 0,0);
		System.out.println(count);
	}
	public static void dfsSolveNQueen(int [] []  rec,int row,int col){
		if(row == rec.length) {
			count++;
			System.out.println(".....第"+count+"种解法...");
			for(int i =0 ; i < rec.length ;i++) {
				for(int j =0 ; j < rec[0].length;j++) {
					System.out.print(rec[i][j]);
				}
				System.out.println();
			}
			return ;
		}
		for(int i = 0 ; i < rec.length ;i++) {
			if(check(rec,row,i))
			{rec[row][i] = 1;
			dfsSolveNQueen(rec,row+1,col);
			rec[row][i]=0;
			}
		}
	}
	private static boolean check(int[] []rec, int row, int col) {
		
		for(int i = 0 ; i < rec.length;i++) {
			if(rec[i][col] != 0) {
				return false;
			}
			for(int j = 0 ; j < rec[0].length ;j++) {
				if(i+j==row+col && rec[i][j]!=0)//算是核心代码 要知道 同一条对角线上的行加列 相等 或者行减列相等
				{
					return false;  
				}
				if(i-j==row-col&&rec[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
	}
}