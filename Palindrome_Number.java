import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
        int n,a;
        n=sc.nextInt();
        if(n<0)
        {
            a=n*-1;
        }
        else{
        a=n;
        }
        int sum=0;
        while(a!=0)
        {
            int r=a%10;
            a/=10;
            sum=sum*10+r;
        }
        if(n<0)
        {
            sum*=-1;
        }
        if(sum==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        }
    }
}