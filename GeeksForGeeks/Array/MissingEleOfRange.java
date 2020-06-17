package Array;

import java.util.HashSet;
import java.util.Scanner;

public class MissingEleOfRange {
	static void missEle(int[] arr,int n,int low,int high)
	{
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			hashSet.add(arr[i]);
		}
		
		for(int i=low;i<=high;i++)
		{
			if(!hashSet.contains(i))
			{
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int low = sc.nextInt();
		  int high = sc.nextInt();
		  int[] arr = new int[n];
		  for(int i=0;i<n;i++)
		  {
	        arr[i]=sc.nextInt();
		  }
		  missEle(arr,n,low,high);		

	}

}
