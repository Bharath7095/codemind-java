import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        int i,a=0,b=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(i<n/2)
            {
                a+=arr[i];
            }
            else
            {
                b+=arr[i];
            }
        }
        if((Math.abs(a-b))%4==0)
        {
            System.out.println("X");
        }
        else
        {
            System.out.println("Y");
        }
    }
}