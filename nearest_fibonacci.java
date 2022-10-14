import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c,d;
        n=sc.nextInt();
        while(true)
        {
            c=a+b;
            a=b;
            b=c;
            if(c>n)
            {
                d=a+b;
                break;
            }
        }
        int m,z;
        m=n-a;
        z=c-n;
        if(m<z)
        {
            System.out.println(a);
        }
        else if(m>z)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println(a+" "+c);
        }
    }
}