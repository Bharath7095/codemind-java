import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int sa=0;
        int sb=0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0)
            {
                sa+=i;
            }
        }
        for(int i=1;i<=b/2;i++)
        {
            if(b%i==0)
            {
                sb+=i;
            }
        }
        if(sb==a && sa==b)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}