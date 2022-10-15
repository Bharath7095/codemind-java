import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            brr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            int m=arr[i]+brr[i];
            System.out.print(m+" ");
        }
    }
}