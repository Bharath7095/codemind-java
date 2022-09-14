import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        double c;
        c=(n-32)*(5/9.0);
        System.out.format("%.2f",c);
    }
}