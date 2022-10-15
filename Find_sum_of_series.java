import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        double sum=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            double a=1.0/i;
            sum+=a;
        }
        System.out.format("%.2f",sum);
    }
}