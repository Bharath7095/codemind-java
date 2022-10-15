import java.util.*;
public class file
{
    public static boolean prime(int n)
    {
        if(n<=1)
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
        int n,a,b;
        n=sc.nextInt();
        a=n;
        b=n;
        while(true)
        {
            if(prime(b))
            {
                break;
            }
            b--;
        }
        while(true)
        {
            if(prime(a))
            {
                break;
            }
            a++;
        }
        int m,z;
        m=n-b;
        z=a-n;
        if(m<=z)
        {
            System.out.println(m);
        }
        else
        {
            System.out.println(z);
        }
    }
}