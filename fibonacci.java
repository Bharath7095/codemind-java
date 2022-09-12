import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int a,b,c;
        a=0;
        b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(i=2;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}