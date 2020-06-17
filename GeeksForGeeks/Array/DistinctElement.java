package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctElement {

	static void distinctEle(int[] a)
	{
		int size = a.length;
		Set<Integer> hashSet = new HashSet<Integer>();
		
		for(int i=0;i<size;i++)
		{
			if(!hashSet.contains(a[i]))
			{
				hashSet.add(a[i]);
			}
		}
		
		for( int i : hashSet ){
            System.out.println( i );
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    distinctEle(arr);		 
		}
}


