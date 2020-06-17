package Array;
import java.util.Scanner;

public class MissingNumber {
    
    static int missingEle(int[] a)
    {
        int X1 = a[0];
        for(int i=1; i<a.length;i++)
        {
            X1 = X1^a[i];
        }
        
        
        
        int X2 = 1;
        for(int j=2; j<=(a.length+1);j++)
        {
            X2 = X2 ^ j;
        }
        
        return (X1 ^ X2);
    }
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		MissingNumber mn = new MissingNumber();
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int miss_ele=mn.missingEle(arr );
		   System.out.println(miss_ele);
		   
		}
	}
}
