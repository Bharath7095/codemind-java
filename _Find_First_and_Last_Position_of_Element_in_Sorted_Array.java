import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,t,a=-1,b=-1;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        t=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(t==arr[i])
            {
                a=i;
                break;
            }
        }
        for(i=n-1;i>=0;i--)
        {
            if(t==arr[i])
            {
                b=i;
                break;
            }
        }
        System.out.println(a+" "+b);
    }
}