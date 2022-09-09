import java.util.*;
import java.lang.*;
public class file
{
    public static void main(String[] args)
    {
        int a,b,c;
        double ar,s;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(double)(a+b+c)/2;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",ar);
        
    }
    
}