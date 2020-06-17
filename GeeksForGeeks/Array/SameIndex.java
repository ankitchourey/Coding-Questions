package Array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SameIndex {

	/*package whatever //do not write package name here */


		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-- > 0)
			{
			    int n = sc.nextInt();
			    int[] arr = new int[n];
			    boolean flag = false;
			    for(int i=0;i<n;i++)
			    {
			        arr[i]=sc.nextInt();
			    }
			    
			    for(int j=0;j<n;j++)
			    {
			        if(j+1==arr[j])
			        {
			            flag = true;
			            System.out.print(arr[j]+" ");
			        }
			    }
			    
			    if(!flag)
			        System.out.print("Not Found");
			    System.out.println();
			}
		}
	}
