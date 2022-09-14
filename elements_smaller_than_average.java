import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,s=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        int avg;
        avg=s/n;
        for(i=0;i<n;i++)
        {
            if(arr[i]<=avg)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}