import java.util.*;
public class file
{
    public static boolean palin(int n)
    {
        int a=n;
        int rev=0;
        while(a!=0)
        {
            int r=a%10;
            a/=10;
            rev=rev*10+r;
        }
        if(rev==n)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a=n;
        while(true)
        {
            a--;
            if(palin(a))
            {
                break;
            }
        }
        int b=n;
        while(true)
        {
            b++;
            if(palin(b))
            {
                break;
            }
        }
        if(b-n>n-a)
        {
            System.out.println(a);
        }
        else if(b-n<n-a)
        {
            System.out.println(b);
        }
        else
        {
            System.out.print(a+" "+b);
        }
    }
}