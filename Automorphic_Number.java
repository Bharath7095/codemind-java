import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a=n*n;
        int sum=0;
        int c=0;
        while(a!=0)
        {
            int r=a%10;
            a/=10;
            sum=sum*10+r;
            int rev=0;
            int s=sum;
            while(s!=0)
            {
                r=s%10;
                s/=10;
                rev=rev*10+r;
            }
            if(rev==n)
            {
                System.out.println("Automorphic Number");
                c=1;
                break;
            }
            if(rev>n)
            {
                break;
            }
        }
        if(c==0)
        {
            System.out.println("Not an Automorphic Number");
        }
    }
}