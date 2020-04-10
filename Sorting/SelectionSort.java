package sorting;

public class SelectionSort {

	static void SelectionSort(int[] a, int n)
	{
		int iMin,i,j;
		for(i=0;i<n-1;i++) //Shifting the boundary of unsorted or increasing boundary of sorted subarr
		{
			iMin=i; //assuming first ele as minimum
			for(j=i+1;j<n;j++)//
			{
				if(a[j]<a[iMin]) 
				{
					//comparing min ele with next ele. For ex : 7 with  in 6 
					//now 6 is small so 6 will be stored in iMin
					iMin=j;
				}
			}
			
			int temp=a[i];
			a[i]=a[iMin];
			a[iMin]=temp;
		}
		for(int k=0;k<n;k++)
		{
			System.out.print(a[k]);
		}
	}
	public static void main(String[] args) {
		int[] a= {1,2,5,7,6,9,8};
		int n=a.length;
		SelectionSort(a, n);
		System.out.println();
	}

}
