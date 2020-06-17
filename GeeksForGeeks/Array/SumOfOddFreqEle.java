package Array;

import java.util.Scanner;

public class SumOfOddFreqEle {
	
	static int getSum(int[] a, int n)
	{
		int sum=0;
		for(int i=0; i<n;i++)
		{
			if(i%2==0)
			{
				sum+=a[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int[] arr = new int[n];
		  for(int i=0;i<n;i++)
		  {
	        arr[i]=sc.nextInt();
		  }
		  System.out.println(getSum(arr,n));		

	}

}
