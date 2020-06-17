package Array;

public class Rotation {

	static void reverse(int[] a,int start,int end)
	{
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int k=2; //no of space to reverse
		int[] arr= {1,2,3,4,5};
		int n=arr.length;
		reverse(arr, 0,n-1);
		reverse(arr, 0,k-1 );
		reverse(arr, k, n-1);
	}

}
