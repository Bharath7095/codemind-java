import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,a;
        n=sc.nextInt();
        a=n;
        while(a!=0)
        {
            int r;
            r=a%10;
            a/=10;
            rev=rev*10+r;
        }
        if(rev==n)
        {
            System.out.println('2');
        }
        else
        {
            System.out.println('1');
        }
    }
}