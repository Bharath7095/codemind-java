import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n-2;i+=2)
        {
            if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2])
            {
                c=1;
            }
            else if(arr[i]>arr[i+1] && arr[i+1]<arr[i+2])
            {
                c=1;
            }
            else
            {
                c=0;
                break;
            }
        }
        if(c==1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}