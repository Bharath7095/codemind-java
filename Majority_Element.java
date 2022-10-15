import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int arr[]=new int[n];
        int c,count=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int num;
        for(i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c>=count)
            {
                count=c;
            }
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c==count)
            {
                num=arr[i];
                break;
            }
        }
        num=arr[i];
        System.out.println(num);
    }
}