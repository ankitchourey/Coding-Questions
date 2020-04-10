package Array;
import java.util.*;
public class ReverseArraym {
	
	static void reverse(int[] a,int n)
	{
		int[] b = new int[n];
		int j=n;
		for(int i=0;i<n;i++)
		{
			b[j-1]=a[i];
			j=j-1;
		}
		for(int k=0;k<b.length;k++)
		{
			System.out.print(b[k]);
		}
	}
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array :");
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("Enter the array elements :");
				arr[i]=sc.nextInt();
			}
			reverse(arr,n);
		}
}

