package Array;

import java.util.Scanner;

public class SumOfMatrix {

	static void sumRow(int[][] arr,int row, int col)
	{
		int sumrow=0, greatestSum=0;
		for(int i = 0;  i < row; i++)
		  {
	        for (int j = 0; j < col; j++) 
	        {
				sumrow=sumrow+arr[i][j];
			}
	        System.out.println("Sum of row "+ i + " = " +sumrow);
	        if(sumrow>greatestSum)
	        	greatestSum=i;
	        sumrow=0;
		  }
		System.out.println("Rows with greatest sum is "+greatestSum);
	}
	
	
	static void sumCol(int[][] arr,int row, int col)
	{
		int sumcol=0,greatestSum=0;
		for(int i = 0;  i < col; i++)
		  {
	        for (int j = 0; j < row; j++) 
	        {
				sumcol=sumcol+arr[j][i];
			}
	        System.out.println("Sum of col "+ i + " = " +sumcol);
	        if(sumcol>greatestSum)
	        	greatestSum=i;
	        sumcol=0;
		  }
		System.out.println("Col with greatest sum is "+greatestSum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int row = sc.nextInt();
		  int col = sc.nextInt();
		  int[][] arr = new int[row][col];
		  for(int i = 0;  i < row; i++)
		  {
	        for (int j = 0; j < col; j++) 
	        {
				arr[i][j]=sc.nextInt();
			}
		  }
		  sumRow(arr,row,col);
		  sumCol(arr,row,col);

	}

}
