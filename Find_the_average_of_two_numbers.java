import java.util.*;
public class file
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        double avg;
        avg=(double)(a+b)/2;
        System.out.format("%.4f",avg);
    }
}