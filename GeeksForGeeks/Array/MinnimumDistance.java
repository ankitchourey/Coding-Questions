package Array;

import java.util.Scanner;

public class MinnimumDistance {

	static int minDist(int[] arr, int n, int x, int y)
		{
			int min_Dist = Integer.MAX_VALUE;
			
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if((x==arr[i] && y==arr[j] || y==arr[j] && x==arr[i])  
						&& min_Dist>Math.abs(x-y))
					{
						min_Dist = Math.abs(x-y);
					}
				}
			}
			return min_Dist;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int res = minDist(arr,n,x,y);
		    System.out.print(res);
		}

	}

}
