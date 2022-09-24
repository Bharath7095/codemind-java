import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,r=0,re=0;
        n=sc.nextInt();
        int b=n;
        while(n!=0)
        {
            r=n%10;
            re=re*10+r;
            n=n/10;
        }
        if(re==b)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}