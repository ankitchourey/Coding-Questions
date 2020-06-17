package Array;
import java.util.*;
public class MinandMax {
	Scanner sc = new Scanner(System.in);
	
	public void createArray(int[] a,int n)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Insert array element at index: "+i);
			a[i]=sc.nextInt();
		}
	}
	
	public int minEle(int[] a,int n)
	{
		int min=a[0];
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
	}
	
	public int maxEle(int[] a,int n)
	{
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		return max;
	}
}

