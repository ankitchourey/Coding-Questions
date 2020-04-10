package Array;
public class CountOfSmaller {
	
		static int count(int[] a, int n,int x)
		{
			int count=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]<=x)
				{
					//count=count+1;
					count++;
				}
			}
			return count;
		}
		public static void main(String args[])
		{
			int arr[] = {1,2,3,4,7,9};
			int x=7;
			int n=arr.length;
			System.out.println(count(arr,n,x));
		}
}
