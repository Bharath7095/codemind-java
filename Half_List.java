import java.util.*;
public class file
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i;
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=size-1;i>=size/2;i--)
		{
		    System.out.print(arr[i]+" ");
		}
		for(i=0;i<size/2;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}