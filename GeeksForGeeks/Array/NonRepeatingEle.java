package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NonRepeatingEle {

	static void nonRepeating(int[] a, int n) 
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])+1);
			}
			else
				map.put(a[i], 1);
		}
		
		for(int i=0;i<n;i++)
		{
			if(map.get(a[i])==1)
			{
				System.out.println(a[i]);
				break;
			}
				
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		nonRepeating(arr, n);
	}

}
