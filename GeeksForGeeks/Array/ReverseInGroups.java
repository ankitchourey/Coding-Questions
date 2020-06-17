package Array;
import java.util.*;
public class ReverseInGroups {
    
    	static void reverse(int[] arr,int n, int d)
		{
		    for(int i=0; i<n;i=i+d)
		    {
		        int left=i;
		        int right=Math.min(i+d-1 , n-1);
		        
		        while(left<=right)
		        {
		            int temp = arr[left];
		            arr[left] = arr[right];
		            arr[right] = temp;
		            left++;
		            right--;
		        }
		    }
		    
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(arr[j]);
		    }
		}
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int d = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    reverse(arr,n,d);
		}
	}
}
