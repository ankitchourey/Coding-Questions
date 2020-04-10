package Array;
public class SecondLargest {
	public void secondLarge(int a[], int n)
	{
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]>largest) //checking if the largest is greater than arr element
			{
				second_largest=largest;
				largest=a[i];
			}
			
			else if(a[i]>second_largest && a[i]!=largest)
			{
				second_largest=a[i];
			}
		}
		if(second_largest==Integer.MIN_VALUE)
			System.out.println("There is no second largest");
		else
			System.out.println("Second largest element is :"+second_largest);
			
	}
}
