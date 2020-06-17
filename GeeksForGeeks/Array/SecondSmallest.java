package Array;

import java.util.Scanner;

public class SecondSmallest {
	
	static void secondSmallest(int[] a)
	{
		int size=a.length;
		int smallest=Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		for(int i=0;i<size;i++)
		{
			if(smallest>a[i])
			{
				secondsmallest=smallest;
				smallest=a[i];
			}
			
			else if(secondsmallest>a[i] && a[i]!=smallest)
			{
				secondsmallest=a[i];
			}
		}
		if(secondsmallest==Integer.MAX_VALUE)
			System.out.println("No smaller ele");
		else
		{
			System.out.println(smallest);
			System.out.println(secondsmallest);
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    secondSmallest(arr);
		}
		
	}

}
