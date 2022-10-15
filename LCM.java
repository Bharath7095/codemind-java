import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int c;
        if(a>b)
        {
            c=a;
            a=b;
            b=c;
        }
        c=b;
        while(true)
        {
            if(c%a==0 && c%b==0)
            {
                break;
            }
            c++;
        }
        System.out.println(c);
    }
}