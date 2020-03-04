package epam.maven_oops;

public class Chocolate {
	public int total_weight(int[] choco,int n)
	{
		int total=0;
		for(int i=0;i<n;i++)
		{
			total+=choco[i];
		}
		return total;
	}
	public int num_of_candy(int low,int high,int[] choco,int c)
	{
		int count=0;
		for(int i=0;i<c;i++)
		{
			if(choco[i]>=low && choco[i]<=high)
				count++;
		}
		return count;
	}
}
