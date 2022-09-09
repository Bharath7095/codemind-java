import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a,b,c,d;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            if((float)c/a==(float)d/b)
            {
                System.out.println("0");
            }
            else if((float)c/a>(float)d/b)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("-1");
            }
        }
    }
}