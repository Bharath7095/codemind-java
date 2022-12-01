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
        int k=sc.nextInt();
        int count=0;
        for(i=0;i<n;i++)
        {
            int c=1;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    c+=1;
                    arr[j]=0;
                }
            }
            if(c==k && arr[i]!=0)
            {
                System.out.print(arr[i]+" ");
                count=1;
            }
        }
        if(count==0)
        {
            System.out.println("-1");
        }
    }
}