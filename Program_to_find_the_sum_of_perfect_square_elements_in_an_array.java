import java.util.*;
public class file
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i,sum=0;
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			double f=Math.sqrt(arr[i]);
			if(f==(int)f)
			{
			    sum+=arr[i];
			}
		}
		System.out.println(sum);
	}
}