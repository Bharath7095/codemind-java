import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            arr[i]*=arr[i];
        }
        while(true)
        {
            int swap=0,j=1;
            for(i=0;i<n-1;i++)
            {
                if(j>=n)
                {
                    break;
                }
                if(arr[j]<arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swap++;
                }
                j++;
            }
            if(swap==0)
            {
                break;
            }
        }
        for(i=0;i<=n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}