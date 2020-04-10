package Array;

public class SumOfArray {
	int temp;
		public void sum(int[] a)
		{
			for(int i=0;i<a.length;i++)
			{
				temp=temp+a[i];
			}
			System.out.println(temp);
		}
}
