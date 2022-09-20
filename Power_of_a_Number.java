import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double p;
        p=(double)Math.pow(a,b);
        int r;
        r=(int)p%c;
        System.out.println(r);
    }
}