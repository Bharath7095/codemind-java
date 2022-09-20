import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int k=0;k<n;k++)
        {
            int a,p=1;
            a=sc.nextInt();
            for(int i=1;i<=a;i++)
            {
                p*=i;
            }
            System.out.println(p);
        }
    }
}