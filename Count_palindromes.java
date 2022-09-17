import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,a,r;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            a=arr[i];
            int rev=0;
            while(a!=0)
            {
                r=a%10;
                a/=10;
                rev=rev*10+r;
            }
            if(rev==arr[i])
            {
                c++;
            }
        }
        System.out.println(c);
        
    }
}