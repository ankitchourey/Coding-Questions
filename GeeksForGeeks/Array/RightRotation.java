package Array;
import java.util.*;
public class RightRotation {
	    static void rotate(int[] arr, int k) {
	        k=k%arr.length; //if num is < than k of = k we will know
	        reverse(arr,0,arr.length-1);
	        reverse(arr,0,k-1);
	        reverse(arr,k,arr.length-1);
	        for(int i=0;i<arr.length;i++)
	        {
	        	System.out.println(arr[i]);
	        }
	    }
	    
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
	    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the no of places to be shift");
		int d=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter array ele: ");
			arr[i]=sc.nextInt();
		}
		rotate(arr,d);
	}

}
