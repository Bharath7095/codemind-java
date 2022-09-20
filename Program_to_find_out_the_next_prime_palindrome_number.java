import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        while(true)
        {
            n+=1;
            int a=n,rev=0,r;
            while(a!=0)
            {
                r=a%10;
                a/=10;
                rev=rev*10+r;
            }
            if(rev==n)
            {
                int v=0;
                for(int i=2;i<=(int)Math.sqrt(n);i++)
                {
                    if(n%i==0)
                    {
                        v=1;
                        break;
                    }
                }
                if(v==0)
                {
                    System.out.println(n);
                    break;
                }
            }
        }
    }
}