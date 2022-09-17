import java.util.*;
public class file
{
    public static int isprime(int n)
    {
        int i;
        if(n<=1)
        {
            return 0;
        }
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,k;
        n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(isprime(arr[i])==1)
            {
                if(arr[i]<=k)
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}