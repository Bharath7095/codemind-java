import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,n;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            n=i;
            int rev=0,r;
            while(n!=0)
            {
                r=n%10;
                n/=10;
                rev=rev*10+r;
            }
            if(rev==i)
            {
                System.out.print(i+" ");   
            }
        }
    }
}