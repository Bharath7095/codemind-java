import java.util.*;
public class file
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,d,r,k;
        a=sc.nextInt();
        b=sc.nextInt();
        d=(int)(Math.log10(a)+1);
        r=a%(int)(Math.pow(10,b));
        k=a/(int)(Math.pow(10,(d-b)));
        if(r-k<0)
        {
            System.out.println((r-k)*-1);
        }
        else
        {
            System.out.println(r-k);
        }
    }
}