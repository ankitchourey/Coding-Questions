package Array;

import java.util.Scanner;

public class ImmediateSmallerEle {

	static void immEle(int[] a)
    {
        int size=a.length;
        int res=-1;
        for(int i=0;i<size;i++)
        {
            if(i==size-1)
            {
                System.out.print(res+" ");
            }
            else if(a[i+1]<a[i])
            {
                System.out.print(a[i+1]+" ");
            }
            else
            {
                System.out.print(res+" ");
            }
        }
    }		
		public static void main (String[] args) {
			//code
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-- > 0)
			{
			    int n=sc.nextInt();
			    int[] arr = new int[n];
			    for(int i=0;i<n;i++)
			    {
			        arr[i]=sc.nextInt();
			    }
			    immEle(arr);
			}
		}
	}
//468 335 501 170 725 479 359 963 465 706 146 282 828 962 492 996 943 828 437 392 605 903 154 293 383 422 717 719 896 448 727 772 539 870 913 668 300 36 895 704 812 323