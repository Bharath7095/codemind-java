import java.util.*;
public class file
{
    public static boolean prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a=n;
        int rev=0;
        while(a!=0)
        {
            int r=a%10;
            a/=10;
            rev=rev*10+r;
        }
        if(prime(n))
        {
            if(prime(rev))
            {
                System.out.println("circular prime");
            }
            else
            {
                System.out.println("prime but not a circular prime");
            }
        }
        else
        {
            System.out.println("not prime");
        }
    }
}