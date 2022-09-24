import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i,s=0;
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        if(s>n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}