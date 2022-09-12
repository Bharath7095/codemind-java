import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,n,i,c=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                System.out.print(arr[i]+" ");
                c=1;
            }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
    }
}