package Array;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	
	static void arrCheck(long[] a,long[] b)
	{
	    int flag = 1;
	    if(a.length!=b.length)
		    flag=0;
			        	     
		Arrays.sort(a);
 	    Arrays.sort(b);
			    
		for(int j=0;j<a.length;j++)
		{
			if(a[j]!=b[j])
			  flag=0;
		}
			    
		System.out.println(flag);
	}
	
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			while(t-- > 0)
			{
			    int n = Integer.parseInt(br.readLine());
			    String[] s1 = br.readLine().trim().split(" ");
		        String[] s2 = br.readLine().trim().split(" ");
			    long[] a = new long[n];
			    long[] b = new long[n];
			    for(int i=0;i<n;i++)
			    {
			        a[i]=Long.parseLong(s1[i]);
			    }
			    for(int j=0;j<n;j++)
			    {
			        b[j]=Long.parseLong(s2[j]);
			    }
			    		 
			    arrCheck(a,b);
   			}
	}
}
