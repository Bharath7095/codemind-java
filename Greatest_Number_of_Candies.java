import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int arr[]=new int[n];
        int m=-9999;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(m<arr[i])
            {
                m=arr[i];
            }
        }
        int num=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]+=num;
            if(arr[i]>=m)
            {
                System.out.print("True ");
            }
            else
            {
                System.out.print("False ");
            }
        }
    }
}