import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b,c;
        n=sc.nextInt();
        a=0;
        b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(n-2!=0)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            n--;
        }
    }
}