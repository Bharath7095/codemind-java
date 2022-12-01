import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        int min=999;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        while(true)
        {
            int c=0;
            for(i=0;i<n;i++)
            {
                if(arr[i]%min==0)
                {
                    c+=1;
                }
            }
            if(c==n)
            {
                break;
            }
            else
            {
                min--;
            }
        }
        System.out.println(min);
    }
}