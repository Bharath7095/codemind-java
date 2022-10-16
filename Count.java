import java.util.*;
public class file
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i,su=0,sum=0;
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
			{
			    su++;
			}
			else
			{
			    sum++;
			}
		}
		System.out.println(su+" "+sum);
	}
}