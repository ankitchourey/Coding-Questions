package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Sum of elements whose square root is present in the array
//Given an array arr[], the task is to find the sum of all those elements from the given array whose square root is present in the same array.

public class sumofsquareele {

	static int getSum(int[] a) 
	{
		int size=a.length;
		int sum=0;
		
		Set<Integer> hashSet = new HashSet<>();
		for(int i=0;i<size;i++)
		{
			hashSet.add(a[i]);
		}
																									
		for(int i=0;i<size;i++)
		{
			double sqrt = Math.sqrt(a[i]);
			
			// If sqrtCurrent is a decimal number 
			if (Math.floor(sqrt) != Math.ceil(sqrt)) 
                continue;
			
			if(hashSet.contains((int)sqrt))
			{
				sum+=(sqrt * sqrt);
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
		  System.out.println(getSum(arr));		 
	}

}