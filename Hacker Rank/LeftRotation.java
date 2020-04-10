package Array;
import java.util.*;
public class LeftRotation {
	
	static void rotLeft(int[] a, int d) {
        int size = a.length;
        int[] rotated_array = new int[size];
        int i =0;
        int rotate_index=d;
        while(rotate_index<size)
        {
            rotated_array[i]=a[rotate_index];
            i++;
            rotate_index++;
        }
        rotate_index=0;
        while(rotate_index<d)
        {
            rotated_array[i]=a[rotate_index];
            i++;
            rotate_index++;
        }
        for(int j=0;j<size;j++)
        {
        	System.out.println(rotated_array[j]);	
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] a =new int[n];
		System.out.println("Enter the no to be shift");
		int d=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter array ele: ");
			a[i]=sc.nextInt();
		}
		rotLeft(a,d);
	}

}
