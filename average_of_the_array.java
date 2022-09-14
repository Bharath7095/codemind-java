import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        double avg;
        avg=(double)s/n;
        System.out.format("%.2f",avg);
    }
}