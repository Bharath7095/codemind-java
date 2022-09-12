import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,i;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b && c<arr[i])
            {
                c=arr[i];
            }
        }
        if(c!=0)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println("-1");
        }
    }
}