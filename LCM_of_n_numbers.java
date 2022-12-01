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
        int max=-999;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        while(true)
        {
            int c=0;
            for(i=0;i<n;i++)
            {
                if(max%arr[i]==0)
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
                max+=1;
            }
        }
        System.out.println(max);
    }
}