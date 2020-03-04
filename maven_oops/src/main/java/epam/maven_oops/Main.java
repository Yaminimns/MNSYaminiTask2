package epam.maven_oops;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Chocolates==");
		int chocos=sc.nextInt();
		System.out.println("Number of Sweets==");
		int n_sweets=sc.nextInt();
		int[] choco=new int[chocos];
		int[] sweets=new int[n_sweets];
		for(int i=0;i<chocos;i++)
		{
			System.out.println("Enter the weight of "+(i+1)+" chococlate");
			choco[i]=sc.nextInt();
		}
		Chocolate c1=new Chocolate();
		int chocweight=c1.total_weight(choco,chocos);
		for(int i=0;i<n_sweets;i++)
		{
			System.out.println("Enter the weight of "+(i+1)+" sweet");
			sweets[i]=sc.nextInt();
		}
		Sweets s1=new Sweets();
		int sweetweight=c1.total_weight(sweets, n_sweets);
		System.out.print("Enter the lowest weight range of candy:");
		int low=sc.nextInt();
		System.out.print("Enter the highest range of the candy:");
		int high=sc.nextInt();
		int num_of_chococandy=c1.num_of_candy(low,high,choco,chocos);
		int num_of_sweetcandy=s1.num_of_candy(low,high,sweets,n_sweets);
		int total_candy=num_of_chococandy+num_of_sweetcandy;
		if(total_candy>=1)
			System.out.print("***Congratulations you recieved "+total_candy+" candy***");
		else
			System.out.print("You recieved "+total_candy+" candy");
		
		
	}
}
