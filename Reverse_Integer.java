import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n>0)
        {
            int rev=0;
            while(n!=0)
            {
                int r=n%10;
                n/=10;
                rev=rev*10+r;
            }
            System.out.println(rev);
        }
        else
        {
            n=n*-1;
            int rev=0;
            while(n!=0)
            {
                int r=n%10;
                n/=10;
                rev=rev*10+r;
            }
            System.out.println(-1*rev);
        }
    }
}