package Array;

import java.util.Scanner;

public class SumOfBoundryEle {

	static void sumOfBoundry(int[][] arr, int row, int col)
	{
		int sum=0;
		for(int i=0; i < row; i++)
		{
			for (int j = 0; j < col; j++) {
				if(i==0)
					sum+=arr[i][j];
				else if(i==row-1)
					sum+=arr[i][j];
				else if(j==0)
					sum+=arr[i][j];
				else if(j==col-1)
					sum+=arr[i][j];
			}
		}
		System.out.println(sum);
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
		  sumOfBoundry(arr,row,col);
	}

}
