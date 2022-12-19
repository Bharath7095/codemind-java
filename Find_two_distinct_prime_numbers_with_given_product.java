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
        int c=0;
        for(int i=2;i<=n/2;i++)
        {
            for(int j=2;j<=n/2;j++)
            {
                if(i*j==n && prime(i) && prime(j))
                {
                    System.out.print(i+" "+j);
                    c=1;
                    break;
                }
            }
            if(c==1)
            {
                break;
            }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
    }
}