package Array;

import java.util.Scanner;

public class NumberOfOccurence {

	static int numOfOcc(int[] a, int n, int k)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(k==a[i])
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int res =numOfOcc(arr,n,k);
		    
		    if(res!=0)
		    	System.out.println(res);
		    else
		    	System.out.println("-1");
		    
		}
	}

}
