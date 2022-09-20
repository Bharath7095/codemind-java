import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int p,t,r;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        double c;
        c=p*Math.pow((1+(double)t/100),r);
        System.out.format("%.2f",c);
    }
}