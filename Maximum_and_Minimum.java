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
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=9999;
        int max=-999;
        int count=0;
        for(i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c+=1;
                }
            }
            if(c==arr[i])
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                }
                if(arr[i]<min)
                {
                    min=arr[i];
                }
                count=1;
            }
        }
        if(count==0)
        {
            System.out.println("-1");
        }
        else{
        System.out.println(min+" "+max);
        }
    }
}