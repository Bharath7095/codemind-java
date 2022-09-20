import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,a;
        n=sc.nextInt();
        while(true)
        {
            a=n;
            int rev=0,r;
            while(a!=0)
            {
                r=a%10;
                a=a/10;
                rev=rev*10+r;
            }
            n+=rev;
            a=n;
            rev=0;
            while(a!=0)
            {
                r=a%10;
                a=a/10;
                rev=rev*10+r;
            }
            if(rev==n)
            {
                break;
            }
        }
        System.out.println(n);
    }
}