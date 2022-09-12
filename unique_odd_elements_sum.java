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
            if(arr[i]%2!=0)
            {
                int m=0;
                for(int j=0;j<i;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        m=1;
                        break;
                    }
                }
                if(m==0)
                {
                    s+=arr[i];
                }
            }
        }
        System.out.println(s);
    }
}