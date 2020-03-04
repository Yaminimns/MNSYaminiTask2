package epam.maven_oops;

public class Sweets {
	public int total_weight(int[] sweets,int n)
	{
		int total=0;
		for(int i=0;i<n;i++)
		{
			total +=sweets[i];
		}
		return total;
	}
	public int num_of_candy(int low,int high,int[] sweets,int c)
	{
		int count=0;
		for(int i=0;i<c;i++)
		{
			if(sweets[i]>=low && sweets[i]<=high)
				count++;
		}
		return count;
	}
}
