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
        int n,c=0,count=0;
        n=sc.nextInt();
        if(prime(n))
        {
            while(n!=0)
            {
                int r;
                r=n%10;
                n/=10;
                if(prime(r))
                {
                    c++;
                }
                count++;
            }
            if(c==count)
            {
                System.out.println("Mega Prime");
            }
            else
            {
                System.out.println("Not Mega Prime");
            }
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
    }
}