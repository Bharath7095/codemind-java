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
        }
        int count=0;
        double sum=0;
        for(i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    c++;
                    arr[j]=0;
                }
            }
            if(c==arr[i]-1)
            {
                count++;
                sum+=arr[i];
            }
        }
        if(count!=0)
        {
            double avg=sum/count;
            System.out.format("%.2f",avg);
        }
        else
        {
            System.out.println("-1");
        }
    }
}