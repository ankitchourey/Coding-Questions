package sorting;
import java.util.*;
public class InsertionSort {
	static void sort(int[] a,int n)
	{
		int key,value,i;
		for(i=1;i<n;i++)
		{
			value=a[i];
			key=i;
			while(key>0 && a[key-1]>value)
			{
				a[key]=a[key-1];
				key--;
			}
			a[key]=value;
		}
	}
	
	static void print(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sort(a,n);
		print(a);
	}

}
